package com.mathewshereni.inventoryms_springboot_api.repositories;


import com.mathewshereni.inventoryms_springboot_api.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
