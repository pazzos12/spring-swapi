package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {


    // attributes

	private String name;
	@JsonProperty("rotation_period")
	private String rotation_period;
	@JsonProperty("orbital_period")	
	private String orbital_period;
	private String diameter; 
    	private String climate; 
	private String gravity; 
	private String terrain;
	@JsonProperty("surface_water")
	private String surface_water;
    	private String population; 
	private String[] residents; 
   	private String[] films;
    	private String created; 
    	private String edited; 
    	private String url;


 // constructor
 	public Planet(){
 		
 	}

 // getters 
	
 	public String getName() {
 		return name;
 	}

  	public String getRotationPeriod() {
 		return rotation_period;
 	}

 	public String getOrbitalPeriod() {
 		return orbital_period;
 	}
 	
 	public String getDiameter() {
 		return diameter;
 	}
 	
 	public String getClimate() {
 		return climate;
 	}
 	
 	public String getGravity() {
 		return gravity;
 	}
 	
 	public String getTerrain() {
 		return terrain;
 	}
 	
 	public String getSurfaceWater() {
 		return surface_water;
 	}
 	
 	public String getPopulation() {
 		return population;
 	}
 	
 	public String[] getResidents() {
 		return residents;
 	}
 	
 	
 	public String[] getFilms() {
 		return films;
 	}

 	public String getCreated() {
 		return created;
 	}

 	public String getEdited() {
 		return edited;
 	}
 	
 	public String getUrl() {
 		return url;
 	}
 	
 	
 	// setters
 	
 	public void setName(String name) {
 		this.name = name;
 	}
 	
 	public void setRotationPeriod(String rotation_period) {
 		this.rotation_period = rotation_period;
 	}
 	
 	public void setOrbitalPeriod(String orbital_period) {
 		this.orbital_period = orbital_period;
 	}
 	
 	public void setDiameter(String diameter) {
 		this.diameter = diameter;
 	}

 	public void setClimate(String climate) {
 		this.climate = climate;
 	}
 	
 	public void setGravity(String gravity) {
 		this.gravity = gravity;
 	}
 	
 	public void setTerrain(String terrain) {
 		this.terrain = terrain;
 	}	
 	
 	public void setPopulation(String population) {
 		this.population = population;
 	}
 	
 	public void setSurfaceWater(String surface_water) {
 		this.surface_water = surface_water;
 	}
 	
 	public void setResidents(String[] residents) {
 		this.residents = residents;
 	}	

 	public void setFilms(String[] films) {
 		this.films = films;
 	}
 	
 	public void setCreated(String created) {
 		this.created = created;
 	}
 	
 	public void setEdited(String edited) {
 		this.edited = edited;
 	}
 	
 	public void setUrl(String url) {
 		this.url = url;
 	}
}
