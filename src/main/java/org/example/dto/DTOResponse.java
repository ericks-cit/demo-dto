package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.graphql.model.GraphQLResponse;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DTOResponse implements Serializable, GraphQLResponse {

    private DTOData data;

    // Getters and Setters

}
