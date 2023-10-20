package at.dokoe.quarkus.rest;

import at.dokoe.quarkus.Exceptions.RestError;
import at.dokoe.quarkus.model.*;
import at.dokoe.quarkus.service.ItemService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/items")
@Produces(MediaType.APPLICATION_JSON)
public class ItemDisplayController {

    @Inject
    ItemService itemService;

    @Path("/pants")
    @GET
    public List<Pants> getAllPants() {
        return Pants.listAll();
    }

    @Path("/pullovers")
    @GET
    public List<Pullover> getAllPullovers() {
        return Pullover.listAll();
    }

    @Path("/shirts")
    @GET
    public List<Shirt> getAllShirts() {
        return Shirt.listAll();

    }

    @Path("/shoes")
    @GET
    public List<Shoe> getAllShoes() {
        return Shoe.listAll();

    }

    @Path("{id}")
    @GET
    public Item getItemById(@PathParam("id") Integer id) {
        return Item.findById(id);
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteItemById(PurchaseRequest pr) {
        if (itemService.deleteItem(pr.getId())) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity(new RestError("Id not found or valid", 204)).build();
        }
    }

}
