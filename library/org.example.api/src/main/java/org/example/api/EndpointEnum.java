package org.example.api;

public enum EndpointEnum {

    ANILIST(
            "https://graphql.anilist.co",
            "{  Media(id: 1) {    format    genres    tags {      id    }    averageScore  }}"
    ),
    CATALYSISHUB(
            "https://api.catalysis-hub.org/graphql",
            "{reactions(first:2) {  edges {    node {      id      Equation      chemicalComposition      reactionEnergy    }  }}}"
    ),
    COUNTRIES(
            "https://countries.trevorblades.com",
            "{ country(code: \\\"%S\\\") { name native capital emoji currency languages { code name } } }"
    );

    private final String endpoint;
    private final String query;

    EndpointEnum(String endpoint, String query) {
        this.endpoint = endpoint;
        this.query = query;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getQuery() {
        return query;
    }

}
