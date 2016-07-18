package com.example;

import com.example.domain.Persona;
import com.example.service.SocialNetworkService;
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
		ivan.setApellido("Merino");
		ivan.setAge(23);

		Persona dimple = new Persona();
		dimple.setNombre("Dimple");
		dimple.setApellido("Ramchandani");
		dimple.setAge(26);

		Persona novia = new Persona();
		novia.setNombre("Novia");
		novia.setAge(22);

		Persona ismael = new Persona();
		ismael.setNombre("Ismael");
		ismael.setAge(29);

		Persona judith = new Persona();
		judith.setNombre("Judith");
		judith.setAge(25);

		socialNetworkService.addPersona(ivan);
		socialNetworkService.addPersona(dimple);
		socialNetworkService.addPersona(novia);
		socialNetworkService.addPersona(ismael);
		socialNetworkService.addPersona(judith);

		socialNetworkService.addPareja(ivan, novia);

		socialNetworkService.addAmistades(ivan, ismael);
		socialNetworkService.addAmistades(judith, ivan);

		System.out.println("La pareja de Ivan es: ");
		System.out.println(socialNetworkService.getPareja(ivan));


		System.out.println("Los amigos de Ivan son: ");
		System.out.println(socialNetworkService.getAmistades(ivan));
	}
}
