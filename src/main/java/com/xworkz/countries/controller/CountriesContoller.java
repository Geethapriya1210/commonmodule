package com.xworkz.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.countries.dto.CountriesDTO;
import com.xworkz.countries.services.CountriesService;

@Controller
@RequestMapping
public class CountriesContoller {

	

	@Autowired
	private CountriesService service;

	public CountriesContoller() {
		System.out.println("Created \t"+ this.getClass().getSimpleName());
		
	}

	@RequestMapping("/index.doc")
			public String register(CountriesDTO countriesDTO, ModelMap map ) {
		try {
			System.out.println("invoked register");
			int check = this.service.validateAndSave(countriesDTO);
			if (check == 0) {
				map.addAttribute("success");
			} else {
				map.addAttribute("failure");
			}			}catch (Exception e) {

		}return "Success";
	}

}
