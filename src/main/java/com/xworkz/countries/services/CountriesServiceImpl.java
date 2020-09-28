package com.xworkz.countries.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.countries.dao.CountriesDAO;
import com.xworkz.countries.dto.CountriesDTO;

@Service
public class CountriesServiceImpl implements CountriesService {
	
	@Autowired
	private CountriesDAO countriesDAO;

	public CountriesServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	
	@Override
	public int validateAndSave(CountriesDTO countriesDTO) {

		System.out.println("Start: validateSave" );
		int isValid = 1;

		try {
			if (countriesDTO != null) {
				System.out.println("Starting to validate countries");

				String email = countriesDTO.getEmail();
				if (email != null && !email.isEmpty()) {
					System.out.println("email is valid");
					isValid = 0;
				} else {
					System.out.println("email is not valid");
					isValid = 1;
				}
				String papulation = countriesDTO.getPopulation();
				if (isValid == 0 && papulation != null && !papulation.isEmpty()) {
					System.out.println("papulation is valid");
					isValid = 0;
				} else {
					System.out.println("papulation is not valid");
					isValid = 1;
				}
				String countryname = countriesDTO.getCountryname();
				if (countryname != null && !countryname.isEmpty()) {
					System.out.println("countryname is valid");
					isValid = 0;
				} else {
					System.out.println("countryname is not valid");
					isValid = 1;
				}
			}
			
			String continent = countriesDTO.getContinent();
			if ( continent != null && !continent.isEmpty()) {
				System.out.println("continent is valid");
				isValid = 0;
			} else {
				System.out.println("continent is not valid");
				isValid = 1;
			}
		
			String capital = countriesDTO.getCapital();
			if (capital != null && !capital.isEmpty()) {
				System.out.println("capital is valid");
				isValid = 0;
			} else {
				System.out.println("capital is not valid");
				isValid = 1;
			}
			
			if (isValid == 0) {
				System.out.println("Data is valid and can save fields");
				countriesDAO.save(countriesDTO);
				return isValid;
			}
			System.out.println("End: validateSave countries " + countriesDTO);
		} catch (Exception e) {
			System.err.println("Exception in validateSave " + e.getMessage());
		}
		return isValid;
	}

	

}
