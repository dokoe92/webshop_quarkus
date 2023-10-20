package at.dokoe.quarkus.rest;

import at.dokoe.quarkus.Exceptions.RestError;
import at.dokoe.quarkus.model.Item;
import at.dokoe.quarkus.model.Pullover;
import at.dokoe.quarkus.model.PurchaseRequest;
import at.dokoe.quarkus.service.ShoppingCartService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/cart")
@Produces(MediaType.APPLICATION_JSON)
public class ShoppingCartController {








}
