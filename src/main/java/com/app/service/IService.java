package com.app.service;

import com.app.domain.User;

public interface IService {
	public boolean login(String uName,String pwd);
	public String registration(User user);

}
