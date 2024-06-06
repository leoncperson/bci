/**
 * @author cbenez
 */
package cl.globallogic.bci.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.globallogic.bci.entity.UserEntity;

/**
 *
 */
public interface UserRepository extends JpaRepository<UserEntity, UUID>{

}
