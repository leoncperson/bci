/**
 * @author cbenez
 */
package cl.globallogic.bci.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;

    private String name;

    private String email;

    private String password;

    private LocalDateTime created;

    private LocalDateTime lastLogin;

    private Boolean isActive;
}
