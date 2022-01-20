package com.wedsitefim.service.impl;

import java.util.List;

import com.wedsitefim.dao.ITheloaiDAO;
import com.wedsitefim.dao.impl.TheloaiDAO;
import com.wedsitefim.model.TheloaiModel;
import com.wedsitefim.service.ITheloaiService;

public class TheloaiService implements ITheloaiService{
	
	private ITheloaiDAO theloaiDao;
	
	public TheloaiService() {
		theloaiDao = new TheloaiDAO();
	}

	@Override
	public List<TheloaiModel> findAll() {
		// TODO Auto-generated method stub
		return theloaiDao.findAll();
	}

}
