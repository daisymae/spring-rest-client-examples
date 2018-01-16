package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ExpirationDate implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -5696106927633684171L;
	private Date date;
	private String timezone_type;
	private String timezone;
}
