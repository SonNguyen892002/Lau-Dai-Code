package com.wedsitefim.dao.impl;

import java.util.List;

import com.wedsitefim.dao.IUserDAO;
import com.wedsitefim.mapper.UserMapper;
import com.wedsitefim.model.UserfimModel;

public class UserDAO extends AbstractDAO<UserfimModel> implements IUserDAO{

	@Override
	public List<UserfimModel> findAll() {
		String sql = "SELECT * FROM users";
		return query(sql, new UserMapper());
	}

}
