package org.example.graphql.service;

import org.example.graphql.GraphQLClient;
import org.example.graphql.GraphQLResponse;

public interface GraphQLService {
	
    public GraphQLClient getClient();

    public void setClient(GraphQLClient client);

    public String execute(String apiUrl, String query);

    public <T> GraphQLResponse execute(String apiUrl, String query, T dto);

    public <T> GraphQLResponse execute(String apiUrl, String query, Class<T> dto);

}
