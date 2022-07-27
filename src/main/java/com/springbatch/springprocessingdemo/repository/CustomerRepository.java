package com.springbatch.springprocessingdemo.repository;

import com.springbatch.springprocessingdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
