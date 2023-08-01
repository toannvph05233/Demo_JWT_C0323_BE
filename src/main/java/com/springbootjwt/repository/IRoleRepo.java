package com.springbootjwt.repository;

import com.springbootjwt.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRoleRepo extends PagingAndSortingRepository<Role, Integer> {
}
