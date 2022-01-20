package com.wedsitefim.dao.impl;

import java.util.List;

import com.wedsitefim.dao.ITheloaiDAO;
import com.wedsitefim.mapper.TheloaiMapper;
import com.wedsitefim.model.TheloaiModel;

public class TheloaiDAO extends AbstractDAO<TheloaiModel> implements ITheloaiDAO{

	@Override
	public List<TheloaiModel> findAll() {
		String sql = "SELECT * FROM theloai";
		return query(sql, new TheloaiMapper());
	}

}
