package com.example.restcontroller.api;

import com.example.restcontroller.jpa.Product;
import com.example.restcontroller.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")

public class ProductAPI {
    private final ProductService productService;

    public ProductAPI(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.fillAllProduct());
    }
    @PostMapping
    public ResponseEntity createProduct(@Valid @RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }
//    @GetMapping("/id")
//    public ResponseEntity<Product> findbyId(@PathVariable Integer id) {
//        Optional<Product> product = productService.findbyID(id);
//        if (!product.isPresent()) {
//            ResponseEntity.badRequest().build();
//        }
//        return ResponseEntity.ok(product.get());
//    }
////    @DeleteMapping
//    public ResponseEntity delete(@PathVariable Integer id){
//        Optional<Product> product = productService.findbyID(id);
//        if (!product.isPresent()){
//            ResponseEntity.badRequest().build();
//        }
//        productService.DeleteProduct(id);
//        return ResponseEntity.ok().build();
//    }
//    @GetMapping('/id')
//    public ResponseEntity<Product> findbyId(@PathVariable Integer id) {
//        Optional<Product> product = productService.findbyID(id);
//        if (!product.isPresent()) {
//            ResponseEntity.badRequest().build();
//        }
//        return ResponseEntity.ok(product.get());
//    }
}
