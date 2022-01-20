package com.wedsitefim.service.impl;

import java.util.List;

import com.wedsitefim.dao.IUserDAO;
import com.wedsitefim.dao.impl.UserDAO;
import com.wedsitefim.model.UserfimModel;
import com.wedsitefim.service.IUserfimService;

public class UserfimService implements IUserfimService{
	
	private IUserDAO userDao;
	
	public UserfimService() {
		userDao = new UserDAO();
	}

	@Override
	public List<UserfimModel> findAll() {
		return userDao.findAll();
	}

}
