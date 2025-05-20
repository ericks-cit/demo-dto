package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DTOLanguage {

    private String code;
    private String name;

    // Getters and Setters

}
