package net.elgali.jpamysqljson.repo;

import net.elgali.jpamysqljson.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
