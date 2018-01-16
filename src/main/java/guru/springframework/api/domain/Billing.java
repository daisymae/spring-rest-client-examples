package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Billing implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -7106102458836277893L;
	private ArrayList<Card> cards[];
}
