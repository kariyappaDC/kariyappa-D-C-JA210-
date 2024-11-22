package com.hexaware.ctms.services;

import java.util.List;

import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.exception.PlayerNotFoundException;

public interface IPlayerService {

	    
	    List<Player> getAllPlayers();  
	    Player addPlayer(Player player);
	    Player getPlayerById(int pId)throws PlayerNotFoundException;
	    Player updatePlayer(int pId, Player player)throws PlayerNotFoundException;
	    void deletePlayer(int pId)throws PlayerNotFoundException;
	    
}

	

