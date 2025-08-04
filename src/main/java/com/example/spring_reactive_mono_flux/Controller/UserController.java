package com.example.spring_reactive_mono_flux.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@GetMapping
	public Flux<String> getUsers(){
		return Flux.just("NAVEEN","nivas","shiva");
	}
	@GetMapping("/{id}")
	public Mono<String> getUser(@PathVariable String id){
		return  Mono.just("User"+id);
	}
	
}
