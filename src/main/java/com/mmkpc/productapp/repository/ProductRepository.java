package com.mmkpc.productapp.repository;

import com.mmkpc.productapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
