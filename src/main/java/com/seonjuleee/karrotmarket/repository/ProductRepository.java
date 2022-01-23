package com.seonjuleee.karrotmarket.repository;

import com.seonjuleee.karrotmarket.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
