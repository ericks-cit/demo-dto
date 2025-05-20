package org.example.controller;

// RootController.java
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.Response;
import org.example.dto.DTOResponse;
import org.example.endpoint.EndpointEnum;
import org.example.graphql.service.GraphQLService;
import org.example.service.ControllerService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Named;

@RestController
public class RootController {

//    protected final GraphQLService service;
    @Named("controllerService")
    protected final ControllerService controllerService;
    protected String apiUrl = EndpointEnum.COUNTRIES.getEndpoint();
    protected String query = EndpointEnum.COUNTRIES.getQuery();

//    public RootController(GraphQLService service) {
    public RootController(ControllerService controllerService) {
        this.controllerService = controllerService;
    }

//    @GetMapping(value = { "/graphql", "/graphql/{code}", "/graphql/country/{code}" })
//    public Response getRootResponse(@PathVariable(required = false) String code) {
//        if (code == null) {
//            code = "BR";
//        }
//
//        String query = EndpointEnum.COUNTRIES.getQuery().replaceAll("%code%", code);
//
//        return getResponse(this.apiUrl, query);
//    }

//    @PostMapping("/graphql")
//    public Response getRootResponse() {
//        String query = this.query.replaceAll("%code%", "BR");
//
//        return controllerService.getResponse(this.apiUrl, query);
//    }

//    @GetMapping("/user")
//    public GraphQLResponse getUser() {
//        return graphQLClient.fetchUserData();
//    }

}
