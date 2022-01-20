package com.wedsitefim.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.wedsitefim.model.TheloaiModel;

public class TheloaiMapper implements Rowmapper<TheloaiModel>{

	@Override
	public TheloaiModel mapRow(ResultSet resultSet) {
		try {
			TheloaiModel theloai = new TheloaiModel();
			theloai.setId(resultSet.getLong("id"));
			theloai.setTheLoai(resultSet.getString("theLoai"));
			return theloai;
		} catch (SQLException e) {
			return null;
		}
	}

}
