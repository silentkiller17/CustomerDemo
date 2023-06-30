package com.example.CustomerCrud.repository;

//Hibernate jpa file, here connecting Entity class to service implementation class
//EmployeeRepository.java
import com.example.CustomerCrud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}