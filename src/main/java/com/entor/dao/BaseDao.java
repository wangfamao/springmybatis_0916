package com.entor.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	public T queryById(Class<?> cls,Serializable id);
	public void add(T t);
	public void update(T t);
	public void deleteById(Class<?> cls,Serializable id);
	public List<T> queryAll(Class<?> cls);
}
