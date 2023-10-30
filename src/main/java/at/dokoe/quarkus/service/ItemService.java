package at.dokoe.quarkus.service;

import at.dokoe.quarkus.model.Item;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ItemService {

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

    public Item selectItem


}
