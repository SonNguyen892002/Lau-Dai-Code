package com.wedsitefim.mapper;

import java.sql.ResultSet;

public interface Rowmapper<T> {
	T mapRow(ResultSet resultSet);
}
