package com.entor.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.BaseDao;
import com.entor.service.BaseService;

@Service("baseService")
public class BaseServiceImpl<T> implements BaseService<T> {

	@Resource
	private BaseDao<T> baseDao;
	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return baseDao.queryById(cls, id);
	}

	@Override
	public void add(T t) {
		baseDao.add(t);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		baseDao.deleteById(cls, id);
	}

	@Override
	public List<T> queryAll(Class<?> cls) {
		return baseDao.queryAll(cls);
	}

}
