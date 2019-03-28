package com.app.dao;

import com.app.domain.User;

public interface IDao {
	public boolean login(String uName,String pwd);
	public String registration(User user);


}
