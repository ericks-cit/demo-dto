package org.example.dto;

import org.example.graphql.GraphQLResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDTO extends DTOBase implements GraphQLResponse {

	@JsonProperty("data")
    private Data data;

}
