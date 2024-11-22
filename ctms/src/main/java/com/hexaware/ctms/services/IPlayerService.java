package com.hexaware.ctms.services;

import java.util.List;

import com.hexaware.ctms.dto.PlayerDto;
import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.exception.PlayerNotFoundException;

public interface IPlayerService {

	    
	    List<Player> getAllPlayers();  
	    Player addPlayer(PlayerDto playerDto);
	    Player getPlayerById(int pId)throws PlayerNotFoundException;
	    Player updatePlayer(int pId, PlayerDto playerDto)throws PlayerNotFoundException;
	    void deletePlayer(int pId)throws PlayerNotFoundException;
	    
	    public List<Player> getAllPlayersSort();
	    
}

	

