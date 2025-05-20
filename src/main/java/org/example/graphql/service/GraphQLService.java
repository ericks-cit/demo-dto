package org.example.graphql.service;

import jakarta.inject.Named;
import org.example.graphql.model.GraphQLClient;
import org.example.graphql.model.GraphQLResponse;
import org.springframework.stereotype.Service;

@Named
@Service
public interface GraphQLService {

    public GraphQLClient getClient();

    public void setClient(GraphQLClient client);

    public String execute(String apiUrl, String query);

    public <T> GraphQLResponse execute(String apiUrl, String query, T dto);

    public <T> GraphQLResponse execute(String apiUrl, String query, Class<T> dto);

}
