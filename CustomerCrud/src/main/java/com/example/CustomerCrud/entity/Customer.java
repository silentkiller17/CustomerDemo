package com.example.CustomerCrud.entity;

//Hibernate Persistence class
//Employee.java file
//creating employee persistence class(table)
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long customerId;

  private String customerName;

  private float customerSalary;

  public Customer() {
  }

  public Customer(Long customerId, String customerName, float customerSalary) {
      this.customerId = customerId;
      this.customerName = customerName;
      this.customerSalary = customerSalary;
  }

  public Customer( String customerName, float customerSalary) {
      this.customerName = customerName;
      this.customerSalary = customerSalary;
  }

  public Long getEmployeeId() {
      return customerId;
  }

  public void setCustomerd(Long customerId) {
      this.customerId = customerId;
  }

  public String getCustomerName() {
      return customerName;
  }

  public void setCustomerName(String customerName) {
      this.customerName = customerName;
  }

  public float getCustomerSalary() {
      return customerSalary;
  }

  public void setCustomerSalary(float customerSalary) {
      this.customerSalary = customerSalary;
  }
}
