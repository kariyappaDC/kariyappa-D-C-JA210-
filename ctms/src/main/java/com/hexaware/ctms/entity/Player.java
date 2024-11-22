package com.hexaware.ctms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;

    @NotBlank(message = "Player name must not be blank.")
    @Size(min = 3, max = 100, message = "Player name must be between 3 and 100 characters.")
    private String pName;

    @Positive(message = "Jersey number must be positive.")
    private int jerseyNumber;

    @NotBlank(message = "Role must not be blank.")
    @Size(min = 3, max = 50, message = "Role must be between 3 and 50 characters.")
    private String role;

    @Positive(message = "Total matches must be positive.")
    private int totalMatches;

    @NotBlank(message = "Team name must not be blank.")
    @Size(min = 3, max = 50, message = "Team name must be between 3 and 50 characters.")
    private String teamName;

    @NotBlank(message = "Country/State name must not be blank.")
    @Size(min = 3, max = 50, message = "Country/State name must be between 3 and 50 characters.")
    private String countryName;

    @Size(max = 500, message = "Description must not exceed 500 characters.")
    private String description;

    public Player() {
        super();
    }

    public Player(int pId, String pName, int jerseyNumber, String role, int totalMatches, 
                  String teamName, String countryName, String description) {
        this.pId = pId;
        this.pName = pName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        this.totalMatches = totalMatches;
        this.teamName = teamName;
        this.countryName = countryName;
        this.description = description;
    }

 

    public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}



	public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pName=" + pName + ", jerseyNumber=" + jerseyNumber + ", role=" + role
				+ ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", countryName=" + countryName
				+ ", description=" + description + "]";
	}

 
}
