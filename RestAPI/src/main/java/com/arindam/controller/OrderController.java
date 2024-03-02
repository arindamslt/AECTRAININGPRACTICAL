package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Order;
import com.arindam.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
OrderService oservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Order order)
	{
		String msg="ORDER ADDED SUCCESSFULLY";
		oservice.addData(order);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Order>> getData()
	{
		List<Order> olist=oservice.getData();
		return new ResponseEntity<List<Order>>(olist,HttpStatus.OK);
	}
	@DeleteMapping("/del/{icode}")
	public ResponseEntity<String> deleteData(@PathVariable Integer icode)
	{
		String msg="ORDER DELETED SUCCESSFULLY";
		oservice.deleteData(icode);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@PutMapping("/upd/{icode}")
	public ResponseEntity<Order> updateData(@PathVariable Integer icode,@RequestBody Order order)
	
	{
	  Order ord=oservice.updateData(icode, order);
	  return new ResponseEntity<Order>(ord,HttpStatus.OK);
	}
	@GetMapping("/fetch/{orderid}")
	public ResponseEntity<Order> getOrderById(@PathVariable Integer orderid)
	{
		Order order=oservice.getOrderById(orderid);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}
	@GetMapping("/fetch/quantity/{qty}")
	public ResponseEntity<List<Order>> getDataByQunatity(@PathVariable Integer qty)
	{
		List<Order> ord=oservice.getDataByQunatity(qty);
		return new ResponseEntity<List<Order>>(ord,HttpStatus.OK);
	}
}
