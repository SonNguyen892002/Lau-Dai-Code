package com.wedsitefim.dao;

import java.util.List;

import com.wedsitefim.mapper.Rowmapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, Rowmapper<T> rowMapper, Object... parameters);
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
