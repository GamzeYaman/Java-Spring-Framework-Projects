package com.SofttechBootcamp.Assignment3.Product.Dao;

import com.SofttechBootcamp.Assignment3.Product.Model.Pro_Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Pro_ProductDao extends JpaRepository<Pro_Product, Long> {

    Optional<Pro_Product> findById(Long id);
}
