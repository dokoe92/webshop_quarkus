package at.dokoe.quarkus.rest;

import at.dokoe.quarkus.Exceptions.RestError;
import at.dokoe.quarkus.model.*;
import at.dokoe.quarkus.service.ItemService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Collections;
import java.util.List;

@Path("/items")
@Produces(MediaType.APPLICATION_JSON)
public class ItemDisplayController {

    @Inject
    ItemService itemService;

    @Path("/pants")
    @GET
    public List<Pants> getAllPants() {
        List<Pants> pantsList = Pants.listAll();
        Collections.sort(pantsList);
        return pantsList;
    }

    @Path("/pullovers")
    @GET
    public List<Pullover> getAllPullovers() {
        List<Pullover> pulloverList = Pullover.listAll();
        Collections.sort(pulloverList);
        return pulloverList;
    }

    @Path("/shirts")
    @GET
    public List<Shirt> getAllShirts() {
        List<Shirt> shirtList = Shirt.listAll();
        Collections.sort(shirtList);
        return shirtList;

    }

    @Path("/shoes")
    @GET
    public List<Shoe> getAllShoes() {
        List<Shoe> shoeList = Shirt.listAll();
        Collections.sort(shoeList);
        return shoeList;

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
