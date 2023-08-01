package com.springbootjwt.repository;

import com.springbootjwt.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepo extends PagingAndSortingRepository<Product, Integer> {
}
