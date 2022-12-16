package com.example.Country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	public CountryRepository couRepo;
	
	public Country create(Country cou) {
		return couRepo.save(cou);
	}
	public List<Country> getAll() {
		return couRepo.findAll();
	}

	public Optional<Country> getById(String id) {
		return couRepo.findById(id);
	}

	public Country update(String id, Country country) {
		country.setCountryID(id);
		return couRepo.save(country);
	}

	public String delete(String id) {
		couRepo.deleteById(id);
		return "Deleted Successfully";
	}

}
