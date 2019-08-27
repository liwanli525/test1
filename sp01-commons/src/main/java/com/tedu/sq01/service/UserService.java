package com.tedu.sq01.service;

import com.tedu.sq01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
