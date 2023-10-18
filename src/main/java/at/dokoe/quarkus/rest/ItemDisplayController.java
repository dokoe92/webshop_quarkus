package at.dokoe.quarkus.rest;

import at.dokoe.quarkus.model.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/items")
@Produces(MediaType.APPLICATION_JSON)
public class ItemDisplayController {


    @Path("/pants")
    @GET
    public List<Pants> getAllPants() {
        return Pants.listAll();
    }

    @Path("/pullover")
    @GET
    public List<Pullover> getAllPullovers() {
        return Pullover.listAll();
    }

    @Path("/shirt")
    @GET
    public List<Shirt> getAllShirts() {
        return Shirt.listAll();

    }

    @Path("/shoe")
    @GET
    public List<Shoe> getAllShoes() {
        return Shoe.listAll();

    }

    @Path("{id}")
    @GET
    public Item getItemById(@PathParam("id") Integer id) {
        return Item.findById(id);
    }


}
