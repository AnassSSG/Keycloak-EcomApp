package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id("P01").name("PC").price(2300).quantity(23)
                    .build());
            productRepository.save(Product.builder().id("P02").name("PHONE").price(1200).quantity(15)
                    .build());
            productRepository.save(Product.builder().id("P03").name("TABLE").price(4200).quantity(45)
                    .build());
        };
    }

}
