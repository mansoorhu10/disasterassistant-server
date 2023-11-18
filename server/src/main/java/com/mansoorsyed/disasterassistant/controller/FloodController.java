package com.mansoorsyed.disasterassistant.controller;

import com.mansoorsyed.disasterassistant.model.flood.Flood;
import com.mansoorsyed.disasterassistant.model.flood.FloodDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FloodController {
    
    @Autowired
    private FloodDao floodDao;

    @GetMapping("/flood/get-all")
    public List<Flood> getAllFloods() {
        return floodDao.getAllFloods();
    }

    @PostMapping("/flood/save")
    public Flood save(@RequestBody Flood flood) {
        return floodDao.save(flood);
    }
}
