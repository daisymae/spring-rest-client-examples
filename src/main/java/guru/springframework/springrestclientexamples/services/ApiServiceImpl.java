package guru.springframework.springrestclientexamples.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	private final String api_url;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
		super();
		this.restTemplate = restTemplate;
		this.api_url = api_url;
	}
	
	/**
	 * First pass at getUsers. Using SpringTemplate.
	 */
	@Override
	public List<User> getUsers(Integer limit) {
		UriComponentsBuilder uriBuilder = UriComponentsBuilder
		    .fromUriString(api_url)
				.queryParam("limit", limit);
		// url updated to use a property
		UserData userData = restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
		return userData.getData();
	}

	/**
	 * Second pass at getUsers. Using reactive WebClient.
	 */
    @Override
    public Flux<User> getUsers(Mono<Integer> limit) {

        return WebClient
                .create(api_url)
                .get()
                .uri(uriBuilder -> uriBuilder.queryParam("limit", limit.block()).build())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(resp -> resp.bodyToMono(UserData.class))
                .flatMapIterable(UserData::getData);
    }
}
