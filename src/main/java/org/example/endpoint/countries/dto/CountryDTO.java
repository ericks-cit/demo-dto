package org.example.endpoint.countries.dto;

import org.example.dto.DTOBase;
import org.example.graphql.GraphQLResponse;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryDTO extends DTOBase implements GraphQLResponse {
	
    private String name;
    @JsonAlias("native")
    private String local;
    private String capital;
    private String emoji;
    private String currency;
	@JsonProperty("languages")
    private GraphQLResponse[] languages;	

}
