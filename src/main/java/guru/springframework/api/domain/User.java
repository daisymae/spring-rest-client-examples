package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	/**
	 * generated
	 */
	private static final long serialVersionUID = 6116031685990722389L;
	private String gender;
	private Name name;
	private Location location;
	private String email;
	private Login login;
	private String phone;
	private Job job;
	private Billing billing;
	private String language;
	private String currency;
}
