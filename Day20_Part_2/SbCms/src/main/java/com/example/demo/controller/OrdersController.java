package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrdersService;

@RestController
@RequestMapping(value="/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	@GetMapping(value="/searchByOrderId/{id}")
	public Orders searchByOrderId(@PathVariable int id) {
		return ordersService.searchByOrderId(id);
	}
	
	@PostMapping(value="/placeOrder")
	public String placeOrder(@RequestBody Orders orders) {
		return ordersService.placeOrder(orders);
	}
}
