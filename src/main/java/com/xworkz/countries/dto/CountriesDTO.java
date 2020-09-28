package com.xworkz.countries.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "country")
public class CountriesDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "C_ID")
	private Integer id;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "COUNTRY_NAME")
	private String countryname;
	@Column(name = "POPULATION")
	private String population;
	@Column(name = "CONTINENT")
	private String continent;
	@Column(name = "CAPITAL")
	private String capital;

	public CountriesDTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CountriesDTO [id=" + id + ", email=" + email + ", countryname=" + countryname + ", population="
				+ population + ", continent=" + continent + ", capital=" + capital + "]";
	}

}
