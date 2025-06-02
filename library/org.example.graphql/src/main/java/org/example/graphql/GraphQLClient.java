package org.example.graphql;

//GraphQLClient.java
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class GraphQLClient {

    protected WebTarget getWebTarget(String apiUrl) {
        Client client = ClientBuilder.newClient();

        return client.target(apiUrl);
    }

    public Response getResponse(String apiUrl, String query) {
        WebTarget target = getWebTarget(apiUrl);

        return target.request(MediaType.APPLICATION_JSON)
                .post(
                        Entity.entity(
                                "{\"query\":\"" + query + "\"}",
                                MediaType.APPLICATION_JSON
                        )
                );
    }

}

