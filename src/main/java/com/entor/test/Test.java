package com.entor.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.Order;
import com.entor.entity.OrderProduct;
import com.entor.service.OrderService;
import com.entor.service.ProductService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		OrderService service = (OrderService)context.getBean("orderService");
		ProductService pservice = (ProductService)context.getBean("productService");
		
//		Order order = service.queryById(Order.class,1);
//		System.out.println(order);
		
		
		Order order = service.queryOrderAndProductById(1);
		System.out.println(order);
		List<OrderProduct> list = order.getOrderProducts();
		for(OrderProduct op:list) {
			System.out.println(op.getProduct());
		}
		
		/*
		Order order = new Order();
		order.setReceiveName("柳丁");
		order.setReceiveAddress("广西壮族自治区南宁市农院路1号");
		order.setReceivePhone("13544252525");
		service.add(order);
		*/
		/*
		Product product = new Product();
		product.setName("美的消毒柜");
		product.setPrice(2000);
		pservice.add(product);
		*/
//		Product p = pservice.queryById(Product.class,6);
//		System.out.println(p);
//		p.setName("万和消毒柜");
//		p.setPrice(2200);
		/*
		Product p = new Product();
		p.setId(6);
		p.setPrice(2300);
		pservice.update(p);
		*/
		/*
//		Order order = new Order();
//		order.setId(5);
		
		order.setReceiveName("程宇森");
		order.setReceiveAddress("广西壮族自治区大学路100号");
		order.setReceivePhone("13534632432");
		service.addOrder("1,2", order);
		System.out.println(order.getId());
		*/
//		service.deleteById(Order.class, 5);
//		pservice.deleteById(Product.class, 4);
	}
}
