package com.nilesh.twodbconnectspringboot;

import com.nilesh.twodbconnectspringboot.entity.Product;
import com.nilesh.twodbconnectspringboot.entity.UserClass;
import com.nilesh.twodbconnectspringboot.product.repository.ProductRepository;
import com.nilesh.twodbconnectspringboot.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TwoDbConnectSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoDbConnectSpringbootApplication.class, args);
    }

}
