package com.springbootjwt.service;

import com.springbootjwt.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> getAll(Pageable pageable);
    void save(Product product);
    void delete(int id);
    void edit(Product product);
    Product findById(int id);
}
