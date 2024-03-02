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

@RestController //controller+repsonsebody
@RequestMapping("/order")
public class OrderController {
	@Autowired
OrderService oservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Order order)
	{
		String msg="ORDER ADDED SUCCESSFULLY";
		oservice.addData(order);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Order>> getData()
	{
		List<Order> olist=oservice.getData();
		return new ResponseEntity<List<Order>>(olist,HttpStatus.OK);
	}
	@GetMapping("/fetch/{orderid}")
	public ResponseEntity<Order> getDataById(@PathVariable Integer orderid)
	{
		Order order=oservice.getDataById(orderid);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}
	@DeleteMapping("/del/{orderid}")
	public ResponseEntity<String> deleteData(@PathVariable Integer orderid)
	{
		String msg="ORDER DATA DELETED SUCCESSFULLY";
		oservice.deleteData(orderid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@PutMapping("/upd/{orderid}")
	public ResponseEntity<String> updateData(@PathVariable Integer orderid,@RequestBody Order order)
	{
		String msg="ORDER DATA UPDATED SUCCESSFULLY";
		oservice.updateData(orderid, order);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
