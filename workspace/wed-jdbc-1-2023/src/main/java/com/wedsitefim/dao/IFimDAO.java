package com.wedsitefim.dao;

import java.util.List;

import com.wedsitefim.model.FimModel;

public interface IFimDAO extends GenericDAO<FimModel>{
	List<FimModel> findAll();
	List<FimModel> findAll(Integer offset, Integer limit);
	int getTotalItem();
}
