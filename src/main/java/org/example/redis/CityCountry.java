package org.example.redis;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.enums.Continent;

import java.math.BigDecimal;
import java.util.Set;
@Getter
@Setter
public class CityCountry {
    private Integer id;

    private String name;

    private String district;

    private Integer population;

    private String countryCode;

    private String alternativeCountryCode;

    private String countryName;

    private Continent continent;

    private String countryRegion;

    private BigDecimal countrySurfaceArea;

    private Integer countryPopulation;

    private Set<Language> languages;

    //Getters and Setters omitted
}
