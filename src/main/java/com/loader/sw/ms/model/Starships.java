package com.loader.sw.ms.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "starships")
public class Starships {
	
	@Id
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "starship_class")
	private String starshipClass;
	
	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "cost_in_credits")
	private String costInCredits;
	
	@Column(name = "length")
	private String length;
	
	@Column(name = "crew")
	private String crew;
	
	@Column(name = "passengers")
	private String passengers;
	
	@Column(name = "max_atmosphering_speed")
	private String maxAtmospheringSpeed;
	
	@Column(name = "hyperdrive_rating")
	private String hyperdriveRating;
	
	@Column(name = "mglt")
	private String mglt;
	
	@Column(name = "cargo_capacity")
	private String cargoCapacity;
	
	@Column(name = "consumables")
	private String consumables;
	
	@ManyToMany(mappedBy = "starships")
	private Set<Films> films;
	
	@ManyToMany(mappedBy = "starships")
	private Set<People> pilots;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "created")
	private String created;
	
	@Column(name = "edited")
	private String edited;

	public Starships(Integer id, String name, String model, String starshipClass, String manufacturer,
			String costInCredits, String length, String crew, String passengers, String maxAtmospheringSpeed,
			String hyperdriveRating, String mglt, String cargoCapacity, String consumables, Set<Films> films,
			Set<People> pilots, String url, String created, String edited) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.starshipClass = starshipClass;
		this.manufacturer = manufacturer;
		this.costInCredits = costInCredits;
		this.length = length;
		this.crew = crew;
		this.passengers = passengers;
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
		this.hyperdriveRating = hyperdriveRating;
		this.mglt = mglt;
		this.cargoCapacity = cargoCapacity;
		this.consumables = consumables;
		this.films = films;
		this.pilots = pilots;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}
	
	public Starships() {}

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStarshipClass() {
		return starshipClass;
	}

	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCostInCredits() {
		return costInCredits;
	}

	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}

	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}

	public String getHyperdriveRating() {
		return hyperdriveRating;
	}

	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}

	public String getMglt() {
		return mglt;
	}

	public void setMglt(String mglt) {
		this.mglt = mglt;
	}

	public String getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public Set<Films> getFilms() {
		return films;
	}

	public void setFilms(Set<Films> films) {
		this.films = films;
	}

	public Set<People> getPilots() {
		return pilots;
	}

	public void setPilots(Set<People> pilots) {
		this.pilots = pilots;
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
