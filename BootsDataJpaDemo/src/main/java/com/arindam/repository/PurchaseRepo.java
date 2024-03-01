package com.arindam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arindam.entity.PurchaseDetails;
@Repository
public interface PurchaseRepo extends JpaRepository<PurchaseDetails,String> {
	@Query("from PurchaseDetails p where p.price>:pprice")
public List<PurchaseDetails> getItemByPrice(Double pprice);
}
