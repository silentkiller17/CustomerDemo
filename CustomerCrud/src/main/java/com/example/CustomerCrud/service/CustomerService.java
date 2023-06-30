package com.example.CustomerCrud.service;

//The all services provide to Spring Boot controller class
//Calling all methods from EmployeeServiceImple.java (class) file
//EmployeeService.java
import com.example.CustomerCrud.entity.Customer;

import java.util.List;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
  List<Customer> fetchAllCustomers();
  Customer getCustomerById(Long id);
  Customer updateCustomerById(Long id, Customer customer);
  String deleteDepartmentById(Long id);
}
