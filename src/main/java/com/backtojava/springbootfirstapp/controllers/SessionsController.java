package com.backtojava.springbootfirstapp.controllers;

import com.backtojava.springbootfirstapp.models.Session;
import com.backtojava.springbootfirstapp.repositories.SessionRepository;
import com.backtojava.springbootfirstapp.services.SessionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {
    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    SessionService sessionService;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id){
        return sessionRepository.getOne(id);
    }

    @PostMapping
    public Session create(@RequestBody final Session session){
        return sessionRepository.saveAndFlush(session);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public Session delete(@PathVariable Long id){
        return sessionRepository.getOne(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Session update(@PathVariable Long id, @RequestBody Session session){
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(session, sessionRepository, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }


}
