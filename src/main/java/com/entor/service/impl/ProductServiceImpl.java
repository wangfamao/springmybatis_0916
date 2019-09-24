package com.entor.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderProductDao;
import com.entor.entity.Product;
import com.entor.service.ProductService;

@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{

	@Resource
	private OrderProductDao orderProductDao;
	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		//先删除跟商品关联关系
		orderProductDao.deleteByProductId((Integer)id);
		//删除商品
		super.deleteById(cls, id);
	}

}
