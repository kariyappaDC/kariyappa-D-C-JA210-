package com.hexaware.ctms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.ctms.entity.Player;


@Repository
public interface IPlayerReposotory extends JpaRepository<Player,Integer> {

	@Query("SELECT p FROM Player p ORDER BY p.countryName ASC") 
	List<Player> findAllPlayersSorted();
	
}
