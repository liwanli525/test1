package com.tedu.sq01.service;

import java.util.List;

import com.tedu.sq01.pojo.Item;

public interface ItemService {

	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);

}
