package org.example.application.controller;

import org.example.dto.ResponseDTO;
import org.example.endpoint.EndpointEnum;
import org.example.graphql.GraphQLResponse;
import org.example.graphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@RestController
@RequestMapping("/api/anilist")
public class AniListController {

	@Autowired
	private GraphQLService service;

	@GetMapping({"", "/"})
	public Response getResponse() {
		String apiUrl = EndpointEnum.ANILIST.getEndpoint();
		String query = EndpointEnum.ANILIST.getQuery();
		GraphQLResponse entity = service.execute(apiUrl, query, ResponseDTO.class);

		return Response.ok(entity, MediaType.APPLICATION_JSON).build();
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "I'm the AniList endpoint!";
	}

}
