package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Orders;
import com.example.demo.Service.OrdersService;

@RestController
@RequestMapping("/order")
public class OrdersController {

	@Autowired
	OrdersService orderService;

	// save booking
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public Long addOrder(@RequestBody Orders order) {
		return orderService.saveOrder(order);
	}

	// delete booking
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{orderid}")
	public void deleteOrder(@PathVariable Long orderid) {
		orderService.deleteOrder(orderid);
	}

	// get booking details by id
	@GetMapping("/getbookingById/{bookingId}")
	public Optional<Orders> getBookingById(@PathVariable Long bookingId) {
		return orderService.getOrderbyId(bookingId);
	}

	// get booking details by person name
	@GetMapping("/getbookingByName/{pName}")
	public List<Orders> getBookingByName(@PathVariable String pName) {
		return orderService.getOrderbyName(pName);
	}

	// get booking details by person contact
	@GetMapping("/getbookingByContact/{pNumber}")
	public List<Orders> getBookingByContact(@PathVariable String pNumber) {
		return orderService.getOrderbyContact(pNumber);
	}

	// get booking details by person email
	@GetMapping("/getbookingByEmail/{emailId}")
	public List<Orders> getBookingByEmail(@PathVariable String emailId) {
		return orderService.getOrderbyemail(emailId);
	}
}
