package com.iBi.backend_challenge;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String countryCode;
    private String countryName;
    private String capitalCity;
    private String region;
    private String subregion;
    private int area;

    protected Country() {}

    public Country(
            String countryCode,
            String countryName,
            String capitalCity,
            String region,
            String subregion,
            int area) {

        this.countryCode = countryCode;
        this.countryName = countryName;
        this.capitalCity = capitalCity;
        this.region = region;
        this.subregion = subregion;
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format(
                "Country { " +
                        "country code : %s, " +
                        "country name : %s, " +
                        "capital city : %s, " +
                        "region : %s, " +
                        "subregion : %s, " +
                        "area : %d " +
                        "}",
                countryCode,
                countryName,
                capitalCity,
                region,
                subregion,
                area);
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public int getArea() {
        return area;
    }
}
