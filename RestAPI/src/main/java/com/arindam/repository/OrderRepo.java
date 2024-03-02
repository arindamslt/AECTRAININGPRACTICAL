package com.arindam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arindam.model.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
	@Query("select o from Order o where o.ordqty>:qty")
public List<Order> getDataByQunatity(Integer qty);

}
