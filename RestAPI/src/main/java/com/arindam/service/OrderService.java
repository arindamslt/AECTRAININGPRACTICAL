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
	public void deleteData(Integer icode)
	{
		Order ord=orepo.findById(icode).orElse(null);
		if(icode!=null)
		{
			orepo.delete(ord);
		}
	}
	public Order updateData(Integer icode,Order ods)
	{
		Order ord=orepo.findById(icode).orElse(null);
		if(icode!=null)
		{
			ord.setOrdqty(ods.getOrdqty());
			ord.setOprice(ods.getOprice());
			ord.setOitem(ods.getOitem());
			orepo.save(ord);
			
		}
		return ord;
	}
	public Order getOrderById(Integer orderid)
	{
		Order ord=orepo.findById(orderid).orElse(null);
		return ord;
	}
	public List<Order> getDataByQunatity(Integer qty)
	{
		return orepo.getDataByQunatity(qty);
	}

}
