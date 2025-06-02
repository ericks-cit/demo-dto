package org.example.graphql.serviceImpl;

import org.example.graphql.GraphQLClient;
import org.example.graphql.GraphQLResponse;
import org.example.graphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@Service
public class GraphQLServiceImpl implements GraphQLService {
	
    private GraphQLClient graphQLClient;
    
    public GraphQLServiceImpl() {
		super();
		this.graphQLClient = new GraphQLClient();
	}

	@Override
    public GraphQLClient getClient() {
        return graphQLClient;
    }

    @Override
    public void setClient(GraphQLClient client) {
        this.graphQLClient = client;
    }

    @Override
    public String execute(String apiUrl, String query) {
        Response response = graphQLClient.getResponse(apiUrl, query);

        return response.readEntity(String.class);
    }

    @Override
    public <T> GraphQLResponse execute(String apiUrl, String query, T dto) {
        Response response = graphQLClient.getResponse(apiUrl, query);

        return (GraphQLResponse) response.readEntity(dto.getClass());
    }

    @Override
    public <T> GraphQLResponse execute(String apiUrl, String query, Class<T> dto) {
        Response response = graphQLClient.getResponse(apiUrl, query);

        return (GraphQLResponse) response.readEntity(dto);
    }

}
