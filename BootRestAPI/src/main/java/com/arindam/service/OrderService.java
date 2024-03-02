package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Order;
import com.arindam.repository.OrderRepo;

@Service
public class OrderService {
	@Autowired
OrderRepo orepo;
	public void addData(Order order)
	{
		orepo.save(order);
	}
	public List<Order> getData()
	{
		return orepo.findAll();
	}
	public Order getDataById(Integer orderid)
	{
		return orepo.findById(orderid).orElse(null);
	}
	public void deleteData(Integer orderid)
	{
		Order ord=orepo.findById(orderid).orElse(null);
		if(ord!=null)
		{
			orepo.delete(ord);
		}
	}
	public void updateData(Integer orderid,Order order)
	{
		Order ord=orepo.findById(orderid).orElse(null);
		if(ord!=null)
		{
			ord.setIqty(order.getIqty());
			ord.setPrice(order.getPrice());
			ord.setOitem(order.getOitem());
			orepo.save(ord);
		}
		
	}
}
