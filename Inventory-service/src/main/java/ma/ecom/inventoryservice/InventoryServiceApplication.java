package ma.ecom.inventoryservice;

import ma.ecom.inventoryservice.entities.Product;
import ma.ecom.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository) {

        return args -> {
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Computer")
                    .price(32000)
                    .quantity(12)
                    .build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Smart Phone")
					.price(1100)
					.quantity(12)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Wireless Mouse")
					.price(200)
					.quantity(24)
					.build());
        };
    }

}
