package org.example.application.controller;

import org.example.dto.ResponseDTO;
import org.example.endpoint.EndpointEnum;
import org.example.graphql.GraphQLResponse;
import org.example.graphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {

	@Autowired
	private GraphQLService service;

	@GetMapping({"", "/", "/{code}"})
	public Response getResponse(@PathVariable(required = false) String code) {
		if (code == null) {
			code = "BR";
		}
		
		String apiUrl = EndpointEnum.COUNTRIES.getEndpoint();
		String query = String.format(EndpointEnum.COUNTRIES.getQuery(), code);
		GraphQLResponse entity = service.execute(apiUrl, query, ResponseDTO.class);

		return Response.ok(entity, MediaType.APPLICATION_JSON).build();
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "I'm the Countries endpoint!";
	}

}