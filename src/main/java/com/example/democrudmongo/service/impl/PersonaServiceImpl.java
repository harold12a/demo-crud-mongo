package com.example.democrudmongo.service.impl;


import com.example.democrudmongo.dao.api.PersonaRepository;
import com.example.democrudmongo.generic.GenericServiceImpl;
import com.example.democrudmongo.model.Persona;
import com.example.democrudmongo.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class PersonaServiceImpl extends GenericServiceImpl<Persona,Long> implements PersonaServiceAPI {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }


}
