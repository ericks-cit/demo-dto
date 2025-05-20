package org.example.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DTOCountry {

    private String name;
    @JsonAlias("native")
    private String local;
    private String capital;
    private String emoji;
    private String currency;
    private DTOLanguage[] languages;

    // Getters and Setters

}
