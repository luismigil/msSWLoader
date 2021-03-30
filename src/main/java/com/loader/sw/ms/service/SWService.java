package com.loader.sw.ms.service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.loader.sw.ms.client.SWAPIClient;
import com.loader.sw.ms.helper.SWHelper;
import com.loader.sw.ms.model.Films;
import com.loader.sw.ms.model.People;
import com.loader.sw.ms.model.Starships;
import com.loader.sw.ms.repository.FilmsRepository;
import com.loader.sw.ms.repository.PeopleRepository;
import com.loader.sw.ms.repository.StarshipsRepository;

@Service
public class SWService {

	@Autowired
	private SWAPIClient apiClient;
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	@Autowired
	private StarshipsRepository starshipsRepository;
	
	@Autowired
	private FilmsRepository filmsRepository;
	
	
	public void saveAll(){
		savePeople();
		saveStarships();
		saveFilms();
	}
	
	public void saveFilms() {
		int page = 1;
		String next = null;
		List<Films> films = new ArrayList<Films>();
		do {
			JSONObject json = apiClient.getFilms(page);
			films.addAll(SWHelper.parseJSONtoFilms(json));
			page++;
			next = (String) json.get("next");
		}while(StringUtils.hasLength(next));
		
		filmsRepository.saveAll(films);
	}
	
	public void saveStarships() {
		int page = 1;
		String next = null;
		List<Starships> starships = new ArrayList<Starships>();
		do {
			JSONObject json = apiClient.getStarships(page);
			starships.addAll(SWHelper.parseJSONtoStarships(json));
			page++;
			next = (String) json.get("next");
		}while(StringUtils.hasLength(next));
		
		starshipsRepository.saveAll(starships);
	}
	
	public void savePeople() {
		int page = 1;
		String next = null;
		List<People> people = new ArrayList<People>();
		do {
			JSONObject json = apiClient.getPeople(page);
			people.addAll(SWHelper.parseJSONtoPeople(json));
			page++;
			next = (String) json.get("next");
		}while(StringUtils.hasLength(next));
		
		peopleRepository.saveAll(people);
	}
	
	
}
