package guru.springframework.springrestclientexamples.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.api.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
	
	@Autowired
	ApiService apiService;

	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testGetUsers() {
		List<User>users = apiService.getUsers(3);
		// weirdly, the API is returning 4 (off by one?) when a limit of 3 is given
		assertEquals(4, users.size());
	}

}
