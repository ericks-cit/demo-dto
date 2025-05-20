package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DTOData {

    private DTOCountry country;

    // Getters and Setters

}
