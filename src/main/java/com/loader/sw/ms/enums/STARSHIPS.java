package com.loader.sw.ms.enums;

public enum STARSHIPS {
	NAME_FIELD("name"),
	MODEL_FIELD("model"),
	STARSHIP_CLASS_FIELD("starship_class"),
	MANUFACTURER_FIELD("manufacturer"),
	COST_IN_CREDITS_FIELD("cost_in_credits"),
	LENGTH_FIELD("length"),
	CREW_FIELD("crew"),
	PASSENGERS_FIELD("passengers"),
	MAX_ATMOSPHERING_SPEED_FIELD("max_atmosphering_speed"),
	HYPERDRIVE_RATING_FIELD("hyperdrive_rating"),
	MGLT_FIELD("MGLT"),
	CARGO_CAPACITY_FIELD("cargo_capacity"),
	CONSUMABLES_FIELD("consumables"),
	FILMS_FIELD("films"),
	PILOTS_FIELD("pilots"),
	URL_FIELD("url"),
	CREATED_FIELD("created"),
	EDITED_FIELD("edited");
	
	public final String value;
	
	private STARSHIPS(String value) {
		this.value = value;
	}

}
