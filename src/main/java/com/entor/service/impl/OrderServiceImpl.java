package com.entor.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderDao;
import com.entor.dao.OrderProductDao;
import com.entor.dao.ProductDao;
import com.entor.entity.Order;
import com.entor.entity.OrderProduct;
import com.entor.entity.Product;
import com.entor.service.OrderService;

@Service("orderService")
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService{

	@Resource
	private OrderDao orderDao;
	@Resource
	private ProductDao productDao;
	@Resource
	private OrderProductDao orderProductDao;
	@Override
	public Order queryOrderAndProductById(int id) {
		return orderDao.queryOrderAndProductById(id);
	}
	@Override
	public List<Order> queryAllOrderAndProduct() {
		return orderDao.queryAllOrderAndProduct();
	}
	@Override
	public void addOrder(String pids, Order order) {
		orderDao.add(order);
		for(String pid:pids.split(",")) {
			Product p = productDao.queryById(Product.class, pid);
			OrderProduct op = new OrderProduct();
			op.setProduct(p);
			op.setOrder(order);
			orderProductDao.add(op);
		}
	}
	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		//先删除订单关联关系
		orderProductDao.deleteByOrderId((Integer)id);
		//删除订单
		super.deleteById(cls, id);
	}
}
