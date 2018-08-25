package com.skilldistillery.dangeroussnakes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity 
public class Snake {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	
	protected String name; 
	
	// comma separated in DB
	protected String colors; 
	
	@Column(name="length")
	protected int lengthInInches; 
	
	@Column(name="weight")
	protected int weightInLbs; 
	
	// comma separated in DB
	protected String habitat; 
	
	// comma separated in DB
	protected String region; 
	
	@Min(0)
	@Max(5)
	@Column(name="how_venemous")
	protected int howVenemous; 
	
	// long String
	protected String characteristics; 
	
	// end of fields 
	
	public Snake() {
		
	}

	public Snake(int id, String name, String colors, int lengthInInches, int weightInLbs, String habitat, String region,
			int howVenemous, String characteristics) {
		super();
		this.id = id;
		this.name = name;
		this.colors = colors;
		this.lengthInInches = lengthInInches;
		this.weightInLbs = weightInLbs;
		this.habitat = habitat;
		this.region = region;
		this.howVenemous = howVenemous;
		this.characteristics = characteristics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getLengthInInches() {
		return lengthInInches;
	}

	public void setLengthInInches(int lengthInInches) {
		this.lengthInInches = lengthInInches;
	}

	public int getWeightInLbs() {
		return weightInLbs;
	}

	public void setWeightInLbs(int weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getHowVenemous() {
		return howVenemous;
	}

	public void setHowVenemous(int howVenemous) {
		this.howVenemous = howVenemous;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	@Override
	public String toString() {
		return "Snake [id=" + id + ", name=" + name + ", colors=" + colors + ", lengthInInches=" + lengthInInches
				+ ", weightInLbs=" + weightInLbs + ", habitat=" + habitat + ", region=" + region + ", howVenemous="
				+ howVenemous + ", characteristics=" + characteristics + "]";
	}

}
