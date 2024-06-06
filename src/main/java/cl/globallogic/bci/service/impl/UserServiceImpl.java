/**
 * @author cbenez
 */
package cl.globallogic.bci.service.impl;

import java.util.Optional;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import cl.globallogic.bci.dao.UserRepository;
import cl.globallogic.bci.dto.UserDTO;
import cl.globallogic.bci.dto.UserRequestDTO;
import cl.globallogic.bci.entity.UserEntity;
import cl.globallogic.bci.service.UserService;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	private final UserRepository userRepository;
	
	@Override
	public UserDTO signUp(UserRequestDTO userRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserDTO login(String uuid) {
		
		Optional<UserEntity> userOptional = userRepository.findById(UUID.fromString(uuid));
		// TODO Auto-generated method stub
		return null;
	}
}
