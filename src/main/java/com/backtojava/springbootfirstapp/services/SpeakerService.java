package com.backtojava.springbootfirstapp.services;

import com.backtojava.springbootfirstapp.models.Speaker;
import com.backtojava.springbootfirstapp.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Speaker createSpeaker(Speaker speaker){
        return speakerRepository.saveAndFlush(speaker);
    }

    public Speaker updateSpeaker(Speaker speaker){
        return speakerRepository.saveAndFlush(speaker);
    }

    public void deleteSpeaker(Long id){
        speakerRepository.deleteById(id);
    }

    public Speaker findSpeaker(Long id){
        return speakerRepository.getOne(id);
    }

    public List<Speaker> speakerList(Speaker speaker){
        return speakerRepository.findAll();
    }

    public Speaker findSpeakerWithFirstName(Speaker speaker, String firstName){
        return speakerRepository.findByFirst_name(firstName);
    }

    public List<Speaker> speakerListWithFirstNameAndLastName(Speaker speaker, String firstName, String lastName){
        return speakerRepository.findByFirst_nameAndLast_name(firstName, lastName);
    }

}
