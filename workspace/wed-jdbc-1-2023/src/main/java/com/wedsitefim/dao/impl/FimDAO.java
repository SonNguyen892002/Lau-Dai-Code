package com.wedsitefim.dao.impl;

import java.util.List;

import com.wedsitefim.dao.IFimDAO;
import com.wedsitefim.mapper.FimMapper;
import com.wedsitefim.model.FimModel;

public class FimDAO extends AbstractDAO<FimModel> implements IFimDAO{

	@Override
	public List<FimModel> findAll(Integer offset, Integer limit) {
		String sql = "SELECT * FROM fim order by id desc, danhmucid desc LIMIT ?, ?";
		return query(sql, new FimMapper(), offset, limit);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM fim";
		return count(sql);
	}

	@Override
	public List<FimModel> findAll() {
		String sql = "select * from fim order by id desc";
		return query(sql, new FimMapper());
	}

}
