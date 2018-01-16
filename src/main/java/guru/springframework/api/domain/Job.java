package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Job implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -4151666305013674348L;
	private String title;
	private String company;
}
