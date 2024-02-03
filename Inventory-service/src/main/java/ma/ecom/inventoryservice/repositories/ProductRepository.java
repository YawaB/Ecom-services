package ma.ecom.inventoryservice.repositories;

import ma.ecom.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, String>{
}
