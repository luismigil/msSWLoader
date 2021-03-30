package com.loader.sw.ms.client;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.loader.sw.ms.model.Films;
import com.loader.sw.ms.model.Starships;

@FeignClient(name = "sw-api", url="https://swapi.py4e.com/api")
public interface SWAPIClient {
	
	@GetMapping("/people")
	JSONObject getPeople(@RequestParam(name = "page", required = false) Integer page);
	
	@GetMapping("/films")
	JSONObject getFilms(@RequestParam(name = "page", required = false) Integer page);
	
	@GetMapping("/starships")
	JSONObject getStarships(@RequestParam(name = "page", required = false) Integer page);
	
	
}
