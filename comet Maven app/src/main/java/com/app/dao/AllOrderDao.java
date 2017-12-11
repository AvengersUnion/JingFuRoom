package com.app.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.entity.AllOrder;

@Component
public interface AllOrderDao {
	List<AllOrder> getAllOrdersAll();
	List<AllOrder> getServiceOrder(String id);
	List<AllOrder> getUserOrders(String id);
	
}
