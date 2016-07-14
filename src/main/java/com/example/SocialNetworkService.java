package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SocialNetworkService {
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private ParejaRepository parejaRepository;


    public void addPersona(Persona persona) {

        personaRepository.save(persona);
    }

    public void addPareja(Persona p1, Persona p2) {

        Pareja pareja = new Pareja(p1, p2);
        parejaRepository.save(pareja);
    }

}


