package com.backtojava.springbootfirstapp.repositories;

import com.backtojava.springbootfirstapp.models.PricingCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PricingCategoryRepository extends JpaRepository<PricingCategory, String>{

}




