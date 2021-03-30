package com.loader.sw.ms.enums;

public enum FILMS {
	TITLE_FIELD("title"),
	EPISODE_ID_FIELD("episode_id"),
	OPENING_CRAWL_FIELD("opening_crawl"),
	DIRECTOR_FIELD("director"),
	PRODUCER_FIELD("producer"),
	RELEASE_DATE_FIELD("release_date"),
	SPECIES_FIELD("species"),
	STARSHIPS_FIELD("starships"),
	VEHICLES_FIELD("vehicles"),
	CHARACTERS_FIELD("characters"),
	PLANETS_FIELD("planets"),
	URL_FIELD("url"),
	CREATED_FIELD("created"),
	EDITED_FIELD("edited");
	
	public final String value;
	
	private FILMS(String value) {
		this.value = value;
	}

}
