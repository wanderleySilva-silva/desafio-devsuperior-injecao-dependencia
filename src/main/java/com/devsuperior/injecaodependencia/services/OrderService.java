package com.devsuperior.injecaodependencia.services;

import org.springframework.stereotype.Service;

import com.devsuperior.injecaodependencia.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public double total(Order order) {
		double percentage = 1 - order.getDiscount()/100;
		return percentage*order.getBasic() + shippingService.shipment(order);
	}
}
