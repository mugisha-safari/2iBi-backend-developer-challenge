package com.iBi.backend_challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.lang.Nullable;


@SpringBootApplication
public class BackendChallengeApplication {

	private static final Logger log = LoggerFactory.getLogger(BackendChallengeApplication.class);
	//private static CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendChallengeApplication.class, args);
	}

	/*public String getAllCountries() {
        StringBuilder countries = new StringBuilder();

        // Produces an unsorted list of countries
        for (Country country : countryRepository.findAll()) {
            countries.append(country.toString()).append("\n");
        }

        return countries.toString();
    }

    public String getCountry(String countryCode) {
	    return countryRepository.findByCountryCode(countryCode).toString();
    }

	public String getAllSortedCountries (String sort, String sortDirection) {
	    StringBuilder countries = new StringBuilder();

	    // Produces a sorted list of countries
        if ("DESC".equals(sortDirection)) {
            for (Country country : countryRepository.findAll(Sort.by(Sort.Direction.DESC, sort))) {
                countries.append(country.toString()).append("\n");
            }
        }

        else {
            for (Country country : countryRepository.findAll(Sort.by(Sort.Direction.ASC, sort))) {
                countries.append(country.toString()).append("\n");
            }
        }

	    return countries.toString();
    }

    public void registerCountry(Country country) {
	    countryRepository.save(country);
    }

    public void deleteCountry(Country country) {
        countryRepository.delete(country);
    }

    public void updateCountry(@Nullable String[] fields, @Nullable String[] fieldValues, @Nullable Integer area, String countryCode) {

        // Update any String field by
        // Verifying that the fields and their corresponding values are not null and of the same amount
        if ((fields != null && fieldValues != null) && (fields.length == fieldValues.length)) {

            for (int index = 0; index < fields.length; index++){
                String field = fields[index];

                switch (field) {
                    case "countryName_native" -> countryRepository.updateNativeCountryNameByCountryCode(fieldValues[index], countryCode);
                    case "countryName_en" -> countryRepository.updateEnglishCountryNameByCountryCode(fieldValues[index], countryCode);
                    case "capitalCity" -> countryRepository.updateCapitalCityByCountryCode(fieldValues[index], countryCode);
                    case "region" -> countryRepository.updateRegionByCountryCode(fieldValues[index], countryCode);
                    case "subregion" -> countryRepository.updateSubregionByCountryCode(fieldValues[index], countryCode);
                }
            }
        }

        if (area != null) {
            countryRepository.updateAreaByCountryCode(area, countryCode);
        }
    }*/

    /*@Bean
	public CommandLineRunner demo(CountryRepository repository) {
		return (args) -> {
			// Save a couple of countries
			registerCountry(new Country("MZ", "Mozambique", "Moçambique", "Maputo", "Africa", "Southeast Africa", 801590));
            registerCountry(new Country("DE", "Germany", "Deutsch", "Berlin", "Europe", "Central Europe", 357386));
            registerCountry(new Country("ZA", "South Africa", "South Africa", "Pretoria", "Africa", "Southern Africa", 1220000));
            registerCountry(new Country("PT", "Portugal", "Portugal", "Lisbon", "Europe", "South Europe", 92212));
            registerCountry(new Country("NA", "Namibia", "Namibia", "Windhoek", "Africa", "Southwest Africa", 824292));

			// fetch all countries
			log.info("Countries found with findAll():");
			log.info("-------------------------------");
			log.info(getAllCountries());
			log.info("");

			// fetch an individual country by country code
			log.info("Country found with findByCountryCode(MZ):");
			log.info("--------------------------------");
			log.info(getCountry("MZ"));
			log.info("");

			// Order by area
			log.info("Countries by area:");
			log.info("--------------------------------------------");
            log.info(getAllSortedCountries("area", "ASC"));
			log.info("");
		};
	}*/

}
