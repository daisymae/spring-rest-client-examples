package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Login implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -5178654205107670497L;
	private String username;
	private String password;
	private String md5;
	private String sha1;
	private String sha256;
	
}
