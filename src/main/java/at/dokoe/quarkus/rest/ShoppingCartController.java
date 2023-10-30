package at.dokoe.quarkus.rest;

import at.dokoe.quarkus.Exceptions.RestError;
import at.dokoe.quarkus.dto.AddItemDto;
import at.dokoe.quarkus.dto.ShoppingCartDto;
import at.dokoe.quarkus.model.ShoppingCart;
import at.dokoe.quarkus.service.ShoppingCartService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/cart")
@Produces(MediaType.APPLICATION_JSON)
public class ShoppingCartController {

    @Inject
    ShoppingCartService shoppingCartService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)

    @Path("/add")
    public Response addToShoppingCart(AddItemDto idDto) {
        ShoppingCartDto updatedShoppingcart =  shoppingCartService.addToShoppingCart(idDto.itemId, idDto.userId);
        if (updatedShoppingcart != null) {
            return Response.status(Response.Status.OK).entity(updatedShoppingcart.getItems()).build();
        }
        return Response.status(Response.Status.OK).entity(new RestError("Cant add",404)).build();

    }

    @Path("/clear-cart/{userId}")
    @DELETE
    public Response clearShoppingCart(@PathParam("userId") Integer userId) {
        ShoppingCartDto shopppingCartDto = shoppingCartService.clearShoppingCart(userId);
        return Response.status(Response.Status.OK).entity(shopppingCartDto).build();
    }



}
