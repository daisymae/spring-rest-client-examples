package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Location implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = 6603686953502584245L;
	private String street;
	private String city;
	private String state;
	private String postcode;
	
}
