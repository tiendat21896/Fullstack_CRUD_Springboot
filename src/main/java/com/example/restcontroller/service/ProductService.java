package com.example.restcontroller.service;

import com.example.restcontroller.repository.ProductRepository;
import com.example.restcontroller.jpa.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> fillAllProduct (){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

//    public Optional<Product> findbyID(Integer id){
//        return productRepository.findAllById(id);
//    }
    public  void DeleteProduct(int id){
        productRepository.deleteById(id);
    }
}
