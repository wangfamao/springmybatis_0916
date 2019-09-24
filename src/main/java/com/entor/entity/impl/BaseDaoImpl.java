package com.entor.entity.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.entor.dao.BaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return getSqlSession().selectOne(cls.getSimpleName()+".queryById", id);
	}

	@Override
	public void add(T t) {
		getSqlSession().insert(t.getClass().getSimpleName()+".add", t);
	}
	@Override
	public void update(T t) {
		getSqlSession().update(t.getClass().getSimpleName()+".update", t);
	}
	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		getSqlSession().delete(cls.getSimpleName()+".deleteById", id);
	}
	@Override
	public List<T> queryAll(Class<?> cls) {
		return getSqlSession().selectList(cls.getSimpleName()+".queryAll");
	}
}
