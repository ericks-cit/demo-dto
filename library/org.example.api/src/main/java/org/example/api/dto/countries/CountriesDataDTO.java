package org.example.api.dto.countries;

import org.example.dto.Data;
import org.example.graphql.GraphQLResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountriesDataDTO implements Data, GraphQLResponse {
	
	@JsonProperty("country")
	private CountryDTO country;

}
