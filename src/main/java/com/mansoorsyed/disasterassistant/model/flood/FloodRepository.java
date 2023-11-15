package com.mansoorsyed.disasterassistant.model.flood;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloodRepository extends CrudRepository<Flood, Integer> {
    
}
