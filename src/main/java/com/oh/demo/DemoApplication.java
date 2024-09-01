package com.oh.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.oh.demo.model.Post;
import com.oh.demo.model.User;
import com.oh.demo.repository.PostRepository;
import com.oh.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
	 
	private final PostRepository postRepository;
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Post> postList  = List.of(
      new Post(UUID.randomUUID() ,"title1", "content1", "", LocalDateTime.now()),
      new Post(UUID.randomUUID(), "title2", "content2", "", LocalDateTime.now()),
      new Post(UUID.randomUUID(), "title3", "content3", "", LocalDateTime.now())
    );
		for (Post p : postList) {
			postRepository.save(p);
		}

		List<User> userList = List.of(
			User.builder().email("matthew@test.com")
					.password(passwordEncoder.encode("1234"))
					.name("matthew")
			.build()
		);

		userRepository.saveAll(userList);
		
		
	}

	

}
