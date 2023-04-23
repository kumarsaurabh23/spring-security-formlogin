package com.example.jwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

	//@Autowired
//	private UserRepository repository;
//	@Autowired
//	private PasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

//	@PostConstruct
//	public void initUsers() {
//		List<User> users = List.of(new User(101, "user1", passwordEncoder.encode("pwd1"), "user1@email.com"),
//				new User(102, "user2", "pwd2", "user2@email.com"));
//		repository.saveAll(users);
//	}


}
