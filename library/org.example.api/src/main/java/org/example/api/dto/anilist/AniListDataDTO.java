package org.example.api.dto.anilist;

import org.example.dto.Data;
import org.example.graphql.GraphQLResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AniListDataDTO implements Data, GraphQLResponse {
	
	@JsonProperty("Media")
	private GraphQLResponse media;

}
