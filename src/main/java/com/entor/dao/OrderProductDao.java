package com.entor.dao;

import com.entor.entity.OrderProduct;

public interface OrderProductDao extends BaseDao<OrderProduct>{

	/**
	 * 根据订单主键编号删除关系
	 * @param orderId
	 */
	public void deleteByOrderId(int orderId);
	/**
	 * 根据商品主键编号删除关系
	 * @param productId
	 */
	public void deleteByProductId(int productId);
}
