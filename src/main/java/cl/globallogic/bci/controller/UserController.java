/**
 * @author cbenez
 */
package cl.globallogic.bci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.globallogic.bci.service.UserService;

/**
 *
 */
@RestController
@RequestMapping(value = "/v1/bci")
public class UserController {
	private UserService userService;
	
    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }
	
    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Object> signUp() {
    	return new ResponseEntity<>("respuesta", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Object> login() {
    	return new ResponseEntity<>("respuesta", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
