package at.dokoe.quarkus.service;

import at.dokoe.quarkus.model.Item;
import at.dokoe.quarkus.model.PurchaseRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class ShoppingCartService {


    @Transactional
    public Boolean deleteItem(Integer id) {
        if (id != null) {
            if (Item.findById(id) == null) {
                return false;
            }
            Item.deleteById(id);
            return true;
        }
        return false;
    }
}
