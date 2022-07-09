package com.example.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubcicdApplication {

	@GetMapping("/")
	public String welcome(){
      return "Welcome to NEW-KICK TEK Systems !!!";
	}
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input){
		return "Welcome to "+ input +" Your application deployed successfully";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubcicdApplication.class, args);
	}
}