package com.capgemini.shoppingapp.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.shoppingapp.entity.LineItem;
import com.capgemini.shoppingapp.entity.Order;
import com.capgemini.shoppingapp.service.ShoppingAppService;

@RestController
public class ShoppingAppController {

	@Autowired
	ShoppingAppService orderService;
	
	/*@PostMapping("/shopping/{customerId}")
	public ResponseEntity<LineItem> addLineItem(@RequestBody LineItem item, @PathVariable int customerId) {
		orderService.addLineItem(item, customerId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/shopping/{customerId}")
	public ResponseEntity<Set<LineItem>> getLineItems(@PathVariable int customerId) {
		Set<LineItem> tempSet = orderService.getAllLineItems(customerId);
		return new ResponseEntity<Set<LineItem>>(tempSet, HttpStatus.OK);
	}

	@DeleteMapping("/shopping/{customerId}")
	public ResponseEntity<Set<LineItem>> removeLineItem(@PathVariable int customerId, @RequestBody LineItem item) {
		orderService.removeLineItem(item, customerId);
		return new ResponseEntity<>(HttpStatus.OK);
	}*/

	@PostMapping("/submitorder")
	public ResponseEntity<Order> submitOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.submitOrder(order), HttpStatus.OK);

	}
	
}
