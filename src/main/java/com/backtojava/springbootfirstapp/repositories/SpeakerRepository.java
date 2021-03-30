package com.backtojava.springbootfirstapp.repositories;

import com.backtojava.springbootfirstapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

    Speaker findByFirst_name(String first_name);

    List<Speaker> findByFirst_nameAndLast_name(String first_name, String last_name);


}
