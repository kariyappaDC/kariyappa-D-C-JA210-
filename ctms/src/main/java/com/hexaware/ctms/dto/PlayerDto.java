package com.hexaware.ctms.dto;

public class PlayerDto {
    private int pId;
    private String pName;
    private int jerseyNumber;
    private String role;
    private int totalMatches;
    private String teamName;
    private String countryName;
    private String description;

    public PlayerDto() {
        super();
    }

    public PlayerDto(int pId, String pName, int jerseyNumber, String role, int totalMatches, 
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
        return "PlayerDto [pId=" + pId + ", pName=" + pName + ", jerseyNumber=" + jerseyNumber + 
               ", role=" + role + ", totalMatches=" + totalMatches + 
               ", teamName=" + teamName + ", countryName=" + countryName + 
               ", description=" + description + "]";
    }
}
