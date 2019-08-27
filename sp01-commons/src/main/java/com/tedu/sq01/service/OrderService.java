package com.tedu.sq01.service;

import com.tedu.sq01.pojo.Order;

public interface OrderService {
	
	Order getOrder(String orderId);

	void addOrder(Order order);
}
