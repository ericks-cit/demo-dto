package org.example.controller;

// CountriesController.java
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ws.rs.core.Response;
import org.example.endpoint.EndpointEnum;
import org.example.service.ControllerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController extends RootController {

    public CountriesController(ControllerService controllerService) {
        super(controllerService);
        this.apiUrl = EndpointEnum.COUNTRIES.getEndpoint();
        this.query = EndpointEnum.COUNTRIES.getQuery();
    }

    @GetMapping(value = { "/countries", "/countries/{code}" })
    public Response getCountriesResponse(@PathVariable(required = false) String code) throws JsonProcessingException {
        if (code == null) {
            code = "BR";
        }

        String query = EndpointEnum.COUNTRIES.getQuery().replaceAll("%code%", code);

        return controllerService.getResponse(this.apiUrl, query);
    }

    @PostMapping("/countries")
    public Response getCountriesResponse() {
        String query = EndpointEnum.COUNTRIES.getQuery().replaceAll("%code%", "BR");

        return controllerService.getResponse(this.apiUrl, query);
    }

}
