package com.arindam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Purchase;
@Repository//create the object + database operation
public interface PurchaseRepo extends JpaRepository<Purchase, String> {

}
