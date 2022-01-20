package com.wedsitefim.dao;

import java.util.List;

import com.wedsitefim.model.TheloaiModel;

public interface ITheloaiDAO extends GenericDAO<TheloaiModel>{
	List<TheloaiModel> findAll();
}
