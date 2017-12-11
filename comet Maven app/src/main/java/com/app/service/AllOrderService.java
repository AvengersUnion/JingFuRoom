package com.app.service;

import java.util.List;

import com.app.entity.AllOrder;

public interface AllOrderService {
	List<AllOrder> getAllOrdersAll();
	List<AllOrder> getServiceOrder(String id);
}
