package org.example.graphql;

public interface GraphQLResponse {
	
    // Getters and Setters
	public <T> Object get(String property) throws NoSuchFieldException, 
			SecurityException, 
			IllegalArgumentException, 
			IllegalAccessException;

	public <T> void set(String property, T value) throws NoSuchFieldException, 
			SecurityException, 
			IllegalArgumentException, 
			IllegalAccessException;

}
