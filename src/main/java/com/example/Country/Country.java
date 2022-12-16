package com.example.Country;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Country")
public class Country {
	@Id
	public String id;
	private String CountryID;
	private String CountryName;
	private String RegionID; 
	
	public Country(String CountryID,String CountryName,String RegionID) { 
		this.CountryID=CountryID;
		this.CountryName=CountryName;
		this.RegionID=RegionID;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountryID() {
		return CountryID;
	}
	public void setCountryID(String countryID) {
		CountryID = countryID;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getRegionID() {
		return RegionID;
	}
	public void setRegionID(String regionID) {
		RegionID = regionID;
	}
	
	
}
