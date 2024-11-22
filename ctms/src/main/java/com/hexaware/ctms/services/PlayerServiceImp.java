package com.hexaware.ctms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.repository.IPlayerReposotory;


@Service
public class PlayerServiceImp implements IPlayerService{

    @Autowired
    private IPlayerReposotory playerRepo;
	

    @Override
    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }


    @Override
    public Player addPlayer(Player player) {
        return playerRepo.save(player);
    }

 
    @Override
    public Player getPlayerById(int pId) {
        return playerRepo.findById(pId).orElse(null);
    }

    @Override
    public Player updatePlayer(int pId, Player player) {

        Player existingPlayer = playerRepo.findById(pId).orElse(null);
        
        if (existingPlayer != null) {
            existingPlayer.setpName(player.getpName());
            existingPlayer.setJerseyNumber(player.getJerseyNumber());
            existingPlayer.setRole(player.getRole());
            existingPlayer.setTotalMatches(player.getTotalMatches());
            existingPlayer.setCountryName(player.getCountryName());
            existingPlayer.setDescription(player.getDescription());
            return playerRepo.save(existingPlayer);
        }
        
        return null; 
    }

    @Override
    public void deletePlayer(int pId) {
        playerRepo.deleteById(pId);
    }

}
