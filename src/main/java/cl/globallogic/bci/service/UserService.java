/**
 * @author cbenez
 */
package cl.globallogic.bci.service;

import cl.globallogic.bci.dto.UserDTO;
import cl.globallogic.bci.dto.UserRequestDTO;

public interface UserService {
	
	public UserDTO signUp(UserRequestDTO userRequestDTO);
	
	public UserDTO login(String uuid);
}
