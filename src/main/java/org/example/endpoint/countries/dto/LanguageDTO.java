package org.example.endpoint.countries.dto;

import org.example.dto.DTOBase;
import org.example.graphql.GraphQLResponse;

public class LanguageDTO extends DTOBase implements GraphQLResponse {

    private String code;
    private String name;
	
}
