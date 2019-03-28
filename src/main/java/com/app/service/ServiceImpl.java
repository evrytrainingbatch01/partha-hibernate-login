package com.app.service;

import com.app.dao.DaoImpl;
import com.app.dao.IDao;
import com.app.domain.User;

public class ServiceImpl implements IService {
	private IDao loginDao = new DaoImpl();

	public boolean login(String uName, String pwd) {

		return loginDao.login(uName, pwd);
	}

	public String registration(User user) {

		return loginDao.registration(user);
	}

}
