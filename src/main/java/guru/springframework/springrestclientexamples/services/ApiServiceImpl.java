package guru.springframework.springrestclientexamples.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;

	public ApiServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<User> getUsers(Integer limit) {
		// url of where to retrieve the data, data class to bind to
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
		return userData.getData();
	}

}
