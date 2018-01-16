package guru.springframework.springrestclientexamples.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	private final String api_url;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
		super();
		this.restTemplate = restTemplate;
		this.api_url = api_url;
	}
	
	@Override
	public List<User> getUsers(Integer limit) {
		UriComponentsBuilder uriBuilder = UriComponentsBuilder
		    .fromUriString(api_url)
				.queryParam("limit", limit);
		// url updated to use a property
		UserData userData = restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
		return userData.getData();
	}

}
