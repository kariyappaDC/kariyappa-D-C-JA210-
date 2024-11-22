package com.hexaware.ctms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.dto.PlayerDto;
import com.hexaware.ctms.repository.IPlayerReposotory;

@Service
public class PlayerServiceImp implements IPlayerService {

    @Autowired
    private IPlayerReposotory playerRepo;

    @Override
    public Player addPlayer(PlayerDto playerDto) {
        Player player = new Player();
        player.setpId(playerDto.getpId());
        player.setpName(playerDto.getpName());
        player.setJerseyNumber(playerDto.getJerseyNumber());
        player.setRole(playerDto.getRole());
        player.setTotalMatches(playerDto.getTotalMatches());
        player.setTeamName(playerDto.getTeamName());
        player.setCountryName(playerDto.getCountryName());
        player.setDescription(playerDto.getDescription());

        return playerRepo.save(player);
    }

    @Override
    public Player updatePlayer(int pId, PlayerDto playerDto) {
        Player existingPlayer = playerRepo.findById(pId).orElse(null);

        if (existingPlayer != null) {
            existingPlayer.setpName(playerDto.getpName());
            existingPlayer.setJerseyNumber(playerDto.getJerseyNumber());
            existingPlayer.setRole(playerDto.getRole());
            existingPlayer.setTotalMatches(playerDto.getTotalMatches());
            existingPlayer.setTeamName(playerDto.getTeamName());
            existingPlayer.setCountryName(playerDto.getCountryName());
            existingPlayer.setDescription(playerDto.getDescription());

            return playerRepo.save(existingPlayer);
        }
        
        return null;
    }

    @Override
    public Player getPlayerById(int pId) {
        return playerRepo.findById(pId).orElse(null); 
    }

    @Override
    public void deletePlayer(int pId) {
        playerRepo.deleteById(pId); 
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepo.findAll(); 
    }

    @Override
    public List<Player> getAllPlayersSort() {
        return playerRepo.findAllPlayersSorted(); 
    }
}
