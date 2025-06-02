package org.example.dto.graphql;

import org.example.dto.serializers.DataDeserializer;
import org.example.graphql.GraphQLResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDTO implements GraphQLResponse {

	@JsonProperty("data")
	@JsonDeserialize(using = DataDeserializer.class)
    private Data data;

}
