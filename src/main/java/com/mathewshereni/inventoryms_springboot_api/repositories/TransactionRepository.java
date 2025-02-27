package com.mathewshereni.inventoryms_springboot_api.repositories;


import com.mathewshereni.inventoryms_springboot_api.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
