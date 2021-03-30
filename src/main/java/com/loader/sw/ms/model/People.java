package com.loader.sw.ms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class People {
	
	@Id
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "birth_year")
	private String birthYear;
	
	@Column(name = "eye_color")
	private String eyeColor;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "hair_color")
	private String hairColor;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "mass")
	private String mass;
	
	@Column(name = "skin_color")
	private String skinColor;
	
	@Column(name = "homeworld")
	private String homeworld;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(
			name = "people_films",
			joinColumns = @JoinColumn(name = "people_id"),
			inverseJoinColumns = @JoinColumn(name = "film_id"))
	private Set<Films> films;
	
	//TO-DO implement relationship and Species entity
	@Column(name = "species")
	private String species;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(
			name = "people_starships",
			joinColumns = @JoinColumn(name = "people_id"),
			inverseJoinColumns = @JoinColumn(name = "starship_id"))
	private Set<Starships> starships;
	
	//TO-DO implement relationship and Vehicles entity
	@Column(name = "vehicles")
	private String vehicles;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "created")
	private String created;
	
	@Column(name = "edited")
	private String edited;

	public People(Integer id, String name, String birthYear, String eyeColor, String gender, String hairColor,
			String height, String mass, String skinColor, String homeworld, Set<Films> films, String species,
			Set<Starships> starships, String vehicles, String url, String created, String edited) {
		super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.eyeColor = eyeColor;
		this.gender = gender;
		this.hairColor = hairColor;
		this.height = height;
		this.mass = mass;
		this.skinColor = skinColor;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.starships = starships;
		this.vehicles = vehicles;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}

	public People() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public Set<Films> getFilms() {
		return films;
	}

	public void setFilms(Set<Films> films) {
		this.films = films;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Set<Starships> getStarships() {
		return starships;
	}

	public void setStarships(Set<Starships> starships) {
		this.starships = starships;
	}

	public String getVehicles() {
		return vehicles;
	}

	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	


	
}
