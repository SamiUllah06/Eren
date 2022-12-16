package com.example.Country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@Autowired
	public CountryService service;
	
	@PostMapping("/createcountry")
	public Country createCountry(@Validated @RequestBody Country cou) {
		return service.create(cou);
	}
	
	@GetMapping("/country")
	public List<Country> getAllCountry() {
		return service.getAll();
	}
	
	@GetMapping("/country/{id}")
	public Optional<Country> getAuditById(@PathVariable String id){
		return service.getById(id);
	}

	@PostMapping("/updatecountry/{id}")
	public Country updateAudit(@PathVariable String id, @Validated @RequestBody Country country) {
		return service.update(id, country);
	}

	@DeleteMapping("/deletecountry/{id}")
	public String deleteCountry(@PathVariable String id) {
		service.delete(id);
		return "Country Deleted Successfully";
	}
	
	@GetMapping("/test/{num1}/{num2}")
	int ketan(@PathVariable int num1,@PathVariable int num2 ) {
		return num1+num2;
	}
}
