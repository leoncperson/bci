/**
 * @author cbenez
 */
package cl.globallogic.bci.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Setter
@Getter
@Entity
public class PhoneEntity {

	private long id;
	private long number;
	private int cityCode;
	private String countryCode;
}
