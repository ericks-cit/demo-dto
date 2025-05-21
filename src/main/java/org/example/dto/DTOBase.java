package org.example.dto;

import java.lang.reflect.Field;

import org.example.graphql.GraphQLResponse;

public abstract class DTOBase implements GraphQLResponse {

	@Override
	public <T> Object get(String property) throws NoSuchFieldException, 
			SecurityException, 
			IllegalArgumentException, 
			IllegalAccessException {
        // Attempt to access the field directly
        Field field = this.getClass().getDeclaredField(property);
        field.setAccessible(true); // Allow access to private fields
        
        return field.get(this);
	}

	@Override
	public <T> void set(String property, T value) throws NoSuchFieldException, 
			SecurityException, 
			IllegalArgumentException, 
			IllegalAccessException {
        // Attempt to access the field directly
        Field field = this.getClass().getDeclaredField(property);
        field.setAccessible(true); // Allow access to private fields
        field.set(this, value);
	}

}
