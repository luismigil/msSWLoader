package com.loader.sw.ms.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "films")
public class Films {
	
	@Id
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "episode_id")
	private Integer episodeId;
	
	@Column(name = "opening_crawl", length = 1000)
	private String openingCrawl;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "producer")
	private String producer;
	
	@Column(name = "release_date")
	private String releaseDate;
	
	@Column(name = "species", length = 1000)
	private String species;
	
	@ManyToMany
	@JoinTable(
			name = "films_starships",
			joinColumns = @JoinColumn(name = "film_id"),
			inverseJoinColumns = @JoinColumn(name = "starship_id"))
	private Set<Starships> starships;
	
	@Column(name = "vehicles", length = 1000)
	private String vehicles;
	
	@ManyToMany(mappedBy = "films")
	private Set<People> characters;
	
	@Column(name = "planets", length = 1000)
	private String planets;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "created")
	private String created;
	
	@Column(name = "edited")
	private String edited;

	public Films(Integer id, String title, Integer episodeId, String openingCrawl, String director, String producer,
			String releaseDate, String species, Set<Starships> starships, String vehicles, Set<People> characters,
			String planets, String url, String created, String edited) {
		super();
		this.id = id;
		this.title = title;
		this.episodeId = episodeId;
		this.openingCrawl = openingCrawl;
		this.director = director;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.species = species;
		this.starships = starships;
		this.vehicles = vehicles;
		this.characters = characters;
		this.planets = planets;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}
	
	public Films() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	public String getOpeningCrawl() {
		return openingCrawl;
	}

	public void setOpeningCrawl(String openingCrawl) {
		this.openingCrawl = openingCrawl;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
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

	public Set<People> getCharacters() {
		return characters;
	}

	public void setCharacters(Set<People> characters) {
		this.characters = characters;
	}

	public String getPlanets() {
		return planets;
	}

	public void setPlanets(String planets) {
		this.planets = planets;
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
