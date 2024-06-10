package com.boostmytool.beststore.Services;

import com.boostmytool.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
