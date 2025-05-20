package org.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ws.rs.core.Response;
import org.example.dto.DTOResponse;
import org.springframework.stereotype.Service;

@Service
public interface ControllerService {

    public DTOResponse getEntity(String apiUrl, String query) throws JsonProcessingException;

    public Response getResponse(String apiUrl, String query);

}
