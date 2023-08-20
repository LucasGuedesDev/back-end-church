package com.apichurch.repositories;

import com.apichurch.entities.Church;
import com.apichurch.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChurchRepository extends JpaRepository<Church, Long> {

}
