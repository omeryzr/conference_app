package com.backtojava.springbootfirstapp.services;

import com.backtojava.springbootfirstapp.models.Session;
import com.backtojava.springbootfirstapp.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @PersistenceContext
    private EntityManager entityManager;


    public Session create(Session session){
        return sessionRepository.saveAndFlush(session);
    }






}
