package org.example.api.dto.catalysishub;

import org.example.dto.Data;
import org.example.graphql.GraphQLResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalysDataDTO implements Data, GraphQLResponse {
	
	@JsonProperty("reactions")
	private GraphQLResponse reactions;

}
