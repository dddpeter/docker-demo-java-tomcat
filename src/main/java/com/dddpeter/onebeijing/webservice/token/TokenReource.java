package com.dddpeter.onebeijing.webservice.token;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * Created by dddpe on 2016-2-18.
 */
@Service
@Path("tokenResource")
public class TokenReource {
    @GET
    @Path("getToken")
    @Produces("text/plain;charset=utf-8")
    public String getToken(@Context UriInfo body) throws Exception {
        String token="a5uawwR2BrtQEIN0kwWrrWZ7DRzq5MIvuOTncwDrIUEzhCerCwRMozCgs4ryejK4_qkR3KE6fvGpTgH-L4Gx2BQKUjPPpiEQsNevP8h04G0ofJNcPflgfYC6esulK-eDWJRiAIAZMU";
        return token;
    }
}
