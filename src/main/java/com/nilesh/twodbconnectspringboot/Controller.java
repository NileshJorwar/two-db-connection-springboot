package com.nilesh.twodbconnectspringboot;

import com.nilesh.twodbconnectspringboot.entity.Product;
import com.nilesh.twodbconnectspringboot.entity.UserClass;
import com.nilesh.twodbconnectspringboot.product.repository.ProductRepository;
import com.nilesh.twodbconnectspringboot.user.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    UserRepository userRepository;
    ProductRepository productRepository;

    public Controller(UserRepository userRepository, ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    @PostMapping(value = "/store")
    public String store(@RequestBody UserClass userClass1 ) {
        UserClass userClass = new UserClass(1,"Nilesh");
        Product product = new Product( 1,"Apple", 1300L);
        userRepository.save(userClass1);
        productRepository.save(product);
        System.out.println("Saved the data-------------");
        return "Saved the data.";
    }

    @GetMapping("/get")
    public String getDate() {
        System.out.println("Hi Nil");
        return "Hi Nilesh";
    }
}
