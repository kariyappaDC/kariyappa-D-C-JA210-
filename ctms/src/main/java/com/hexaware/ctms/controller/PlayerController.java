package com.hexaware.ctms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.services.IPlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private IPlayerService service;


    @GetMapping("/get")
    public List<Player> getAllPlayers() {
        return service.getAllPlayers();
    }


    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {
        return service.addPlayer(player);
    }

 
    @GetMapping("/getById/{pId}")
    public Player getPlayerById(@PathVariable int pId) {
        return service.getPlayerById(pId);
    }


    @PutMapping("/update/{pId}")
    public Player updatePlayer(@PathVariable int pId, @RequestBody Player player) {
        return service.updatePlayer(pId, player);
    }

 
    
    @DeleteMapping("/delete/{pId}")
    public String deletePlayer(@PathVariable int pId) {
        service.deletePlayer(pId);
        return "Player with ID " + pId + " deleted successfully.";
    }
}
