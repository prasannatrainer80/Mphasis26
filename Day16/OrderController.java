package com.mphasis.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.cms.model.Orders;
import com.mphasis.cms.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(value="/placeOrder")
	public String placeOrder(@RequestBody Orders order) {
		return orderService.palceOrder(order);
	}
}
