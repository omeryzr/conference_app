package com.backtojava.springbootfirstapp.repositories;

import com.backtojava.springbootfirstapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {



}
