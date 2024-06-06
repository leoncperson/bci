package cl.globallogic.bci.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import cl.globallogic.bci.service.UserService;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
	
	@InjectMocks
	UserController userController;
	  
	@Mock
	UserService userService;
	  
	@Autowired
	public MockMvc mockMvc;
	
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Crear usuario con datos vaidos")
    void testSignUpWithValidData() throws Exception {
        String userJson = "{ \"name\": \"John Doe\", \"email\": \"john.doe@example.com\", \"password\": \"a1b2Cdefg\" }";
        mockMvc.perform(post("/v1/bci/users/sign-up")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNotEmpty())
                .andExpect(jsonPath("$.token").isNotEmpty());
    }
	
}
