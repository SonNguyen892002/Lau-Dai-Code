package com.wedsitefim.dao;

import java.util.List;

import com.wedsitefim.model.UserfimModel;

public interface IUserDAO extends GenericDAO<UserfimModel>{
	List<UserfimModel> findAll();
}
