package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Card implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = 7999810050973309113L;
	private String type;
	private String number;
	private ExpirationDate expiration_date;
	private String iban;
	private String swift;
}
