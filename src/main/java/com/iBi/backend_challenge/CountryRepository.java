package com.iBi.backend_challenge;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.lang.Nullable;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRepository extends PagingAndSortingRepository<Country, String> {

    List<Country> findAll();
    Country findByCountryCode(@Param("countryCode") String countryCode);
    Country findByCountryName(@Param("countryName") String countryName);

    /*List<Country> findAll();

    Country findByCountryCode(String countryCode);

    @Modifying
    @Query("UPDATE Country SET countryName_native = ?1 WHERE countryCode = ?2")
    void updateNativeCountryNameByCountryCode(String countryName_native, String countryCode);

    @Modifying
    @Query("UPDATE Country SET countryName_en = ?1 WHERE countryCode = ?2")
    void updateEnglishCountryNameByCountryCode(String countryName_en, String countryCode);

    @Modifying
    @Query("UPDATE Country SET region = ?1 WHERE countryCode = ?2")
    void updateRegionByCountryCode(String region, String countryCode);

    @Modifying
    @Query("UPDATE Country SET subregion = ?1 WHERE countryCode = ?2")
    void updateSubregionByCountryCode(String subregion, String countryCode);

    @Modifying
    @Query("UPDATE Country SET capitalCity = ?1 WHERE countryCode = ?2")
    void updateCapitalCityByCountryCode(String capitalCity, String countryCode);

    @Modifying
    @Query("UPDATE Country SET area = ?1 WHERE countryCode = ?2")
    void updateAreaByCountryCode(int area, String countryCode);*/
}
