package org.example.dto.serializers;

import java.io.IOException;

import org.example.dto.Data;
import org.example.api.anilist.dto.AniListDataDTO;
import org.example.api.catalysishub.dto.CatalysDataDTO;
import org.example.api.countries.dto.CountriesDataDTO;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataDeserializer extends JsonDeserializer<Data> {
	
	public Data deserialize(JsonParser parser, DeserializationContext context) throws IOException, JacksonException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = parser.getCodec().readTree(parser);
		
	    switch (node.fieldNames().next()) {
	    	case "Media":
	    		return mapper.readValue(parser, AniListDataDTO.class);
	    	case "reactions":
	    		return mapper.readValue(parser, CatalysDataDTO.class);
			case "country":
			default:
				return mapper.readValue(parser, CountriesDataDTO.class);
	    }	    
	}

}
