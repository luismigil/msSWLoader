package com.loader.sw.ms.enums;

public enum PEOPLE {
	NAME_FIELD("name"),
	BIRTH_YEAR_FIELD("birth_year"),
	EYE_COLOR_FIELD("eye_color"),
	GENDER_FIELD("gender"),
	HAIR_COLOR_FIELD("hair_color"),
	HEIGHT_FIELD("height"),
	MASS_FIELD("mass"),
	SKIN_COLOR_FIELD("skin_color"),
	HOMEWORLD_FIELD("homeworld"),
	FILMS_FIELD("films"),
	SPECIES_FIELD("species"),
	STARSHIPS_FIELD("starships"),
	VEHICLES_FIELD("vehicles"),
	URL_FIELD("url"),
	CREATED_FIELD("created"),
	EDITED_FIELD("edited");

	public final String value;
	
	private PEOPLE(String value) {
		this.value = value;
	}
}
