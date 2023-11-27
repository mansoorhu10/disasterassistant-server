package com.mansoorsyed.disasterassistant.model.flood;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class FloodDao {
    
    @Autowired
    private FloodRepository repository;

    public Flood save(Flood flood){
        return repository.save(flood);
    }

    public List<Flood> getAllFloods() {
        List<Flood> floods = new ArrayList<>();
        Streamable.of(repository.findAll())
            .forEach(floods::add);
        return floods;
    }

    public void delete(int floodId){
        repository.deleteById(floodId);
    }
}