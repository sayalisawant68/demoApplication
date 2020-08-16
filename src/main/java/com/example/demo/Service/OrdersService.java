package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Orders;
import com.example.demo.Exception.ObjectNotFoundException;
import com.example.demo.Repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	OrdersRepository ordersRepository;
	
	public Long saveOrder(Orders order) {
		Orders addedOrder = ordersRepository.save(order);
		return addedOrder.getBookingId();
	}
	
	public void deleteOrder(Long orderId) {
		if(!ordersRepository.existsById(orderId))throw new ObjectNotFoundException();
		ordersRepository.deleteById(orderId);
	}
	public Optional<Orders> getOrderbyId(Long orderId) {
		return ordersRepository.findById(orderId);
	}
	
	public List<Orders> getOrderbyName(String pName) {
		return ordersRepository.findBypName(pName);
	}
	
	public List<Orders> getOrderbyContact(String contactNumber) {
		return ordersRepository.findByphoneNumber(contactNumber);
	}
	public List<Orders> getOrderbyemail(String emailId) {
		return ordersRepository.findByemailId(emailId);
	}
	
}
