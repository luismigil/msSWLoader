package com.loader.sw.ms.helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.springframework.web.util.UriTemplate;

import com.loader.sw.ms.enums.FILMS;
import com.loader.sw.ms.enums.PEOPLE;
import com.loader.sw.ms.enums.STARSHIPS;
import com.loader.sw.ms.enums.SWAPI;
import com.loader.sw.ms.model.Films;
import com.loader.sw.ms.model.People;
import com.loader.sw.ms.model.Starships;

public class SWHelper {

	public static List<People> parseJSONtoPeople(JSONObject json){
		List<People> response = new ArrayList<People>();
		List<LinkedHashMap<String, Object>> results = (List<LinkedHashMap<String, Object>>) json.get("results");
		
		for(LinkedHashMap<String, Object> p : results) {
			People people = new People(
					extractURLID((String)p.get(PEOPLE.URL_FIELD.value)),
					(String)p.get(PEOPLE.NAME_FIELD.value),
					(String)p.get(PEOPLE.BIRTH_YEAR_FIELD.value),
					(String)p.get(PEOPLE.EYE_COLOR_FIELD.value),
					(String)p.get(PEOPLE.GENDER_FIELD.value),
					(String)p.get(PEOPLE.HAIR_COLOR_FIELD.value),
					(String)p.get(PEOPLE.HEIGHT_FIELD.value),
					(String)p.get(PEOPLE.MASS_FIELD.value),
					(String)p.get(PEOPLE.SKIN_COLOR_FIELD.value),
					(String)p.get(PEOPLE.HOMEWORLD_FIELD.value),
					extractFilms((ArrayList<String>)p.get(PEOPLE.FILMS_FIELD.value)),
					((ArrayList<String>)p.get(PEOPLE.SPECIES_FIELD.value)).toString(),
					extractStarships((ArrayList<String>)p.get(PEOPLE.STARSHIPS_FIELD.value)),
					((ArrayList<String>)p.get(PEOPLE.VEHICLES_FIELD.value)).toString(),
					(String)p.get(PEOPLE.URL_FIELD.value),
					(String)p.get(PEOPLE.CREATED_FIELD.value),
					(String)p.get(PEOPLE.EDITED_FIELD.value));
			response.add(people);
		}
		return response;
	}
	
	public static List<Starships> parseJSONtoStarships(JSONObject json){
		List<Starships> response = new ArrayList<Starships>();
		List<LinkedHashMap<String, Object>> results = (List<LinkedHashMap<String, Object>>) json.get("results");
		
		for(LinkedHashMap<String, Object> s : results) {
			Starships starship = new Starships(
					extractURLID((String)s.get(STARSHIPS.URL_FIELD.value)),
					(String)s.get(STARSHIPS.NAME_FIELD.value),
					(String)s.get(STARSHIPS.MODEL_FIELD.value),
					(String)s.get(STARSHIPS.STARSHIP_CLASS_FIELD.value),
					(String)s.get(STARSHIPS.MANUFACTURER_FIELD.value),
					(String)s.get(STARSHIPS.COST_IN_CREDITS_FIELD.value),
					(String)s.get(STARSHIPS.LENGTH_FIELD.value),
					(String)s.get(STARSHIPS.CREW_FIELD.value),
					(String)s.get(STARSHIPS.PASSENGERS_FIELD.value),
					(String)s.get(STARSHIPS.MAX_ATMOSPHERING_SPEED_FIELD.value),
					(String)s.get(STARSHIPS.HYPERDRIVE_RATING_FIELD.value),
					(String)s.get(STARSHIPS.MGLT_FIELD.value),
					(String)s.get(STARSHIPS.CARGO_CAPACITY_FIELD.value),
					(String)s.get(STARSHIPS.CONSUMABLES_FIELD.value),
					extractFilms((ArrayList<String>)s.get(STARSHIPS.FILMS_FIELD.value)),
					extractPeople((ArrayList<String>)s.get(STARSHIPS.PILOTS_FIELD.value)),
					(String)s.get(STARSHIPS.URL_FIELD.value),
					(String)s.get(STARSHIPS.CREATED_FIELD.value),
					(String)s.get(STARSHIPS.EDITED_FIELD.value)
					);
			response.add(starship);
		}
		return response;
	}
	
	public static List<Films> parseJSONtoFilms(JSONObject json){
		List<Films> response = new ArrayList<Films>();
		List<LinkedHashMap<String, Object>> results = (List<LinkedHashMap<String, Object>>) json.get("results");
		
		for(LinkedHashMap<String, Object> f : results) {
			Films film = new Films(
					extractURLID((String)f.get(FILMS.URL_FIELD.value)),
					(String)f.get(FILMS.TITLE_FIELD.value),
					(Integer)f.get(FILMS.EPISODE_ID_FIELD.value),
					(String)f.get(FILMS.OPENING_CRAWL_FIELD.value),
					(String)f.get(FILMS.DIRECTOR_FIELD.value),
					(String)f.get(FILMS.PRODUCER_FIELD.value),
					(String)f.get(FILMS.RELEASE_DATE_FIELD.value),
					((ArrayList<String>)f.get(FILMS.SPECIES_FIELD.value)).toString(),
					extractStarships((ArrayList<String>)f.get(FILMS.STARSHIPS_FIELD.value)),
					((ArrayList<String>)f.get(FILMS.VEHICLES_FIELD.value)).toString(),
					extractPeople((ArrayList<String>)f.get(FILMS.CHARACTERS_FIELD.value)),
					((ArrayList<String>)f.get(FILMS.PLANETS_FIELD.value)).toString(),
					(String)f.get(FILMS.URL_FIELD.value),
					(String)f.get(FILMS.CREATED_FIELD.value),
					(String)f.get(FILMS.EDITED_FIELD.value)
					);
			response.add(film);
		}
		return response;
	}
	
	private static Integer extractURLID(String url) {
		UriTemplate uriTemplate = new UriTemplate(SWAPI.URI_TEMPLATE.value);
		Map<String, ?> uriMap = uriTemplate.match(url);
		
		return Integer.valueOf((String)uriMap.get("id"));
	}
	
	private static Set<Films> extractFilms(ArrayList<String> urls){
		Set<Films> films = new HashSet<Films>();
		for(String url : urls) {
			Films film = new Films();
			film.setId(extractURLID(url));
			
			films.add(film);
		}
		
		return films;
	}
	
	private static Set<Starships> extractStarships(ArrayList<String> urls){
		Set<Starships> starships = new HashSet<Starships>();
		for(String url : urls) {
			Starships starship = new Starships();
			starship.setId(extractURLID(url));
			
			starships.add(starship);
		}
		
		return starships;
	}
	
	private static Set<People> extractPeople(ArrayList<String> urls){
		Set<People> people = new HashSet<People>();
		for(String url : urls) {
			People person = new People();
			person.setId(extractURLID(url));
			
			people.add(person);
		}
		
		return people;
	}
}
