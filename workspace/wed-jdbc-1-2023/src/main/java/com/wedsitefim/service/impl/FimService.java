package com.wedsitefim.service.impl;

import java.util.List;

import com.wedsitefim.dao.IFimDAO;
import com.wedsitefim.dao.impl.FimDAO;
import com.wedsitefim.model.FimModel;
import com.wedsitefim.service.IFimService;

public class FimService implements IFimService{
	
	private IFimDAO fimDao;
	
	public FimService() {
		fimDao = new FimDAO();
	}

	@Override
	public List<FimModel> findAll(Integer offset, Integer limit) {
		return fimDao.findAll(offset, limit);
	}

	@Override
	public int getTotalItem() {
		return fimDao.getTotalItem();
	}

	@Override
	public List<FimModel> findAll() {
		return fimDao.findAll();
	}

}
