package com.debuggerme.springbootwithgraphql.repository;

import com.debuggerme.springbootwithgraphql.enity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
