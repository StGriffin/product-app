package com.mmkpc.productapp.service;

import com.mmkpc.productapp.model.Product;
import com.mmkpc.productapp.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    //junk
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
