package com.entor.entity.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.OrderDao;
import com.entor.entity.Order;

@Repository("orderDao")
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao{

	private static final String namespace = "Order";
	
	@Override
	public Order queryOrderAndProductById(int id) {
		return getSqlSession().selectOne(namespace+".queryOrderAndProductById", id);
	}
	@Override
	public List<Order> queryAllOrderAndProduct() {
		return getSqlSession().selectList(namespace+".queryAllOrderAndProduct");
	}
}
