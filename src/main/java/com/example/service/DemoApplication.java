package com.example.service;

import com.example.domain.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class

DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class, args);

		//
		// PersonaService personaService=context.getBean(PersonaService.class);

		//personaService.testPersonas();

		SocialNetworkService socialNetworkService = context.getBean(SocialNetworkService.class);

		testSocialNetwork(socialNetworkService);

	}

	private static void testSocialNetwork(SocialNetworkService socialNetworkService) {
		Persona ivan = new Persona();
		ivan.setNombre("Ivan");
		ivan.setApellido("");
		ivan.setAge(23);

		Persona dimple = new Persona();
		dimple.setNombre("Dimple");
		dimple.setAge(26);

		Persona novia = new Persona();
		novia.setNombre("Novia");
		novia.setAge(22);

		socialNetworkService.addPersona(ivan);
		socialNetworkService.addPersona(dimple);
		socialNetworkService.addPersona(novia);

		socialNetworkService.addPareja(ivan, novia);

		System.out.println("La pareja de Ivan es: ");
		System.out.println(socialNetworkService.getPareja(ivan));
	}
}
