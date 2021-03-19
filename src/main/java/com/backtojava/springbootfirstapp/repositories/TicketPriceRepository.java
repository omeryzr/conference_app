package com.backtojava.springbootfirstapp.repositories;

import com.backtojava.springbootfirstapp.models.TicketPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long>{

}
