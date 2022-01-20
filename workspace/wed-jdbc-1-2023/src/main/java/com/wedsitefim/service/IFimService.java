package com.wedsitefim.service;

import java.util.List;

import com.wedsitefim.model.FimModel;

public interface IFimService {
	List<FimModel> findAll();
	List<FimModel> findAll(Integer offset, Integer limit);
	int getTotalItem();
}
