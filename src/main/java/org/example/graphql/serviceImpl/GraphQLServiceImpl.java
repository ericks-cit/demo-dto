package org.example.graphql.serviceImpl;

import org.example.graphql.model.GraphQLClient;
import org.example.graphql.model.GraphQLResponse;
import org.example.graphql.service.GraphQLService;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Service;

@Named
@Service
public class GraphQLServiceImpl implements GraphQLService {

    @Inject
    private GraphQLClient graphQLClient;

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

//    public Response fetchUserData() {
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target(API_URL);
//
//        String query = "{ user { id name address { street city } } }";
//        Response response = target.request(MediaType.APPLICATION_JSON)
//                .post(Entity.entity("{\"query\":\"" + query + "\"}", MediaType.APPLICATION_JSON));
//
//        return response.readEntity(Response.class);
//    }

}
