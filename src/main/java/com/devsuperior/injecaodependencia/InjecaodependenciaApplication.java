package com.devsuperior.injecaodependencia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.injecaodependencia.entities.Order;
import com.devsuperior.injecaodependencia.services.OrderService;

@SpringBootApplication
public class InjecaodependenciaApplication implements CommandLineRunner{
	
	private OrderService orderService;
	
	public InjecaodependenciaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(InjecaodependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(1123, 95.90, 0.0);
		
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		
	}

}
