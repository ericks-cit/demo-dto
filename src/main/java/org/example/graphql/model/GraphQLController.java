package org.example.graphql.model;

// GraphQLController.java
import org.example.dto.DTOResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphQLController {
    private final GraphQLClient graphQLClient;

    public GraphQLController(GraphQLClient graphQLClient) {
        this.graphQLClient = graphQLClient;
    }

//    @GetMapping("/user")
//    public DTOResponse getUser() {
//        return graphQLClient.fetchUserData();
//    }
}
