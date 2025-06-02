package org.example.application.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ws.rs.core.Response;
import org.example.graphql.GraphQLResponse;

public interface ControllerService {
	
    public GraphQLResponse getEntity(String apiUrl, String query) throws JsonProcessingException;

    public Response getResponse(String apiUrl, String query);

}
