package com.example.CustomerCrud.controller;

//Controller file
//we only create the file(EmployeeController.java)
import com.example.CustomerCrud.entity.Customer;
import com.example.CustomerCrud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService customerService;
  @PostMapping("/customer")
  public Customer saveCustomer(@RequestBody Customer customer) {
      return customerService.saveCustomer(customer);
  }
  @GetMapping("/customer")
  public List<Customer> getAllCustomers() {
      return customerService.fetchAllCustomers();
  }
  @GetMapping("/customer/{id}")
  public Customer getCustomerById(@PathVariable("id") Long id) {
      return customerService.getCustomerById(id);
  }

  @PutMapping("/customer/{id}")
  public Customer updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
      return customerService.updateCustomerById(id, customer);
  }
  @DeleteMapping("/customer/{id}")
  public String deleteCustomer(@PathVariable("id") Long id) {
      return customerService.deleteDepartmentById(id);
  }
}
