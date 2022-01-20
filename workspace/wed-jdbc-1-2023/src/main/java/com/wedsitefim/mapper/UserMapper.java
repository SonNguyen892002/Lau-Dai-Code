package com.wedsitefim.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.wedsitefim.model.UserfimModel;

public class UserMapper implements Rowmapper<UserfimModel>{

	@Override
	public UserfimModel mapRow(ResultSet resultSet) {
		try {
			UserfimModel user = new UserfimModel();
			user.setId(resultSet.getLong("id"));
			user.setUserName(resultSet.getString("userName"));
			user.setFullName(resultSet.getString("fullName"));
			user.setPassword(resultSet.getString("password"));
			user.setEmail(resultSet.getString("email"));
			user.setRoleid(resultSet.getLong("roleid"));
			return user;
		} catch (SQLException e) {
			return null;
		}
	}



}
