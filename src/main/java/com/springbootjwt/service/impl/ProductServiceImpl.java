package com.springbootjwt.service.impl;

import com.springbootjwt.model.Product;
import com.springbootjwt.repository.IProductRepo;
import com.springbootjwt.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepo iProductRepo;
    @Override
    public Page<Product> getAll(Pageable pageable) {
        return iProductRepo.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(int id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public void edit(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepo.findById(id).get();
    }
}
