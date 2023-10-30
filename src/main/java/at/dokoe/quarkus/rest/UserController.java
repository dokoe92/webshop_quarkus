package at.dokoe.quarkus.rest;

import at.dokoe.quarkus.Exceptions.RestError;
import at.dokoe.quarkus.dto.UserCreationDto;
import at.dokoe.quarkus.dto.UserDetailsDto;
import at.dokoe.quarkus.model.User;
import at.dokoe.quarkus.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Path("/user")
public class UserController {

    @Inject
    UserService userService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/new")
    public Response createNewUser(UserCreationDto user) {
        UserDetailsDto newUser = userService.createNewUser(user.username, user.password);
        if (newUser != null) {
            return Response.status(Response.Status.CREATED).entity(newUser).build();
        } else {
            return Response.status(Response.Status.CONFLICT).entity(new RestError("User already registered", 409)).build();
        }
    }


    @Path("/get-user/{userId}")
    @GET
    public Response getUser(@PathParam("userId") Long userId) {
        UserDetailsDto userDetailsDto = userService.getUser(userId);
        return Response.status(Response.Status.OK).entity(userDetailsDto).build();
    }


}
