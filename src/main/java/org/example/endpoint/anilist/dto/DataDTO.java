package org.example.endpoint.anilist.dto;

import org.example.dto.DTOBase;
import org.example.dto.Data;
import org.example.graphql.GraphQLResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataDTO extends DTOBase implements Data, GraphQLResponse {
	
	@JsonProperty("Media")
	private GraphQLResponse media;

}
