package com.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName;
	private String lastName;
	private List<String> country;

	ArrayList<String> countryOptions;

	// create no-arg constructor
	public StudentTwo() {
		countryOptions = new ArrayList<String>();
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United States");
	}

	// define getter/setter methods

	public ArrayList<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getCountry() {
		return country;
	}

	public void setCountry(List<String> country) {
		this.country = country;
	}
}
