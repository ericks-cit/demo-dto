package org.example.application.serviceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.example.application.service.ControllerService;
import org.example.graphql.GraphQLResponse;
import org.example.graphql.service.GraphQLService;

public class ControllerServiceImpl implements ControllerService {
	
    @Inject
    private GraphQLService service;

	@Override
	public GraphQLResponse getEntity(String apiUrl, String query) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String stringifyResponse = service.execute(apiUrl, query);
        System.out.println(stringifyResponse);

        return mapper.readValue(stringifyResponse, GraphQLResponse.class);
	}

	@Override
	public Response getResponse(String apiUrl, String query) {
		GraphQLResponse entity;
        try {
            entity = getEntity(apiUrl, query);
        }
        catch (Exception e) {
            e.printStackTrace();
            return Response.noContent().build();
        }

        return Response.ok(entity).build();
	}

}
