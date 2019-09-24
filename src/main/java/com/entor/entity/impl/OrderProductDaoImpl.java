package com.entor.entity.impl;

import org.springframework.stereotype.Repository;

import com.entor.dao.OrderProductDao;
import com.entor.entity.OrderProduct;

@Repository("orderProductDao")
public class OrderProductDaoImpl extends BaseDaoImpl<OrderProduct> implements OrderProductDao{

	private static final String namespace = "OrderProduct";
	@Override
	public void deleteByOrderId(int orderId) {
		getSqlSession().delete(namespace+".deleteByOrderId", orderId);
	}

	@Override
	public void deleteByProductId(int productId) {
		getSqlSession().delete(namespace+".deleteByProductId", productId);
	}

}
