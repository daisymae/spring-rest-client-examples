package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Name implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -902062416898255608L;
	
	private String title;
	private String first;
	private String last;
}
