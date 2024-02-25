package com.project.web.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class pdetails {

	@Id
	@Column(unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String propertyType;
	private String buildingName;
	private String locality;
	private String city;
	private String state;
	private String zipcode;
	private String bhkType;
	private String furnishedType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getBhkType() {
		return bhkType;
	}
	public void setBhkType(String bhkType) {
		this.bhkType = bhkType;
	}
	public String getFurnishedType() {
		return furnishedType;
	}
	public void setFurnishedType(String furnishedType) {
		this.furnishedType = furnishedType;
	}
	
	public pdetails(int id,String propertyType,String buildingName,String locality,String city,String state,String zipcode,String bhkType,String furnishedType)
	
 {
		super();
		this.id = id;
		this.propertyType = propertyType;
		this.buildingName =buildingName;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.zipcode=zipcode;
		this.bhkType = bhkType;
		this.furnishedType=furnishedType;
	}
	
	public pdetails() {
		
	}
	
	@Override
	public String toString() {
		return "pdetails [id=" + id + ", propertyType=" + propertyType + ", buildingName=" + buildingName
				+ ", locality=" + locality + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", bhkType=" + bhkType + ", furnishedType=" + furnishedType + "]";
	}

	
}
