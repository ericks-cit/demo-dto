package org.example.serviceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.Response;
import org.example.dto.DTOResponse;
import org.example.graphql.service.GraphQLService;
import org.example.service.ControllerService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Service
public class ControllerServiceImp implements ControllerService {

    @Named("graphQLService")
    @Inject
    private GraphQLService service;

    @Override
    public DTOResponse getEntity(String apiUrl, String query) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String stringifyResponse = service.execute(apiUrl, query);
        System.out.println(stringifyResponse);

        return mapper.readValue(stringifyResponse, DTOResponse.class);
    }

    @Override
    public Response getResponse(String apiUrl, String query) {
        DTOResponse entity;
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
