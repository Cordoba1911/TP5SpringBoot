package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long> {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }
}
