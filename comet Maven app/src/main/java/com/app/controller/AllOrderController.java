package com.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entity.AllOrder;
import com.app.service.AllOrderService;
/**
 * 服务订单
 * @author 李洋
 *
 */
@Controller
@RequestMapping("/order/")
public class AllOrderController {
	@Resource(name="allOrderService")
	private AllOrderService allOrderService;
	/**
	 * 获取相应的服务订单
	 * @return
	 */
	@RequestMapping("all")
    @ResponseBody
	public Map getAllOrderList() {
		System.out.println(1);
		AllOrder allOrder=new AllOrder();
		Map<Integer, List<AllOrder>> mapOrders=new HashMap<Integer, List<AllOrder>>();
		List<AllOrder> putOrder=new ArrayList<AllOrder>();
		List<AllOrder> allOrders=allOrderService.getAllOrdersAll();
		System.out.println(allOrders);
		for(int i=0;i<allOrders.size();i++){
			allOrder=allOrders.get(i);
			int j=Integer.parseInt((allOrder.getOrderTime().substring(5, 7)));
			switch (j) {
			case 1:
				putOrder.add(allOrder);
				mapOrders.put(1, putOrder);
				break;
			case 2:
				putOrder.add(allOrder);
				mapOrders.put(2, putOrder);
				break;
			case 3:
				putOrder.add(allOrder);
				mapOrders.put(3, putOrder);
				break;
			case 4:
				putOrder.add(allOrder);
				mapOrders.put(4, putOrder);
				break;
			case 5:
				putOrder.add(allOrder);
				mapOrders.put(5, putOrder);
				break;
			case 6:
				putOrder.add(allOrder);
				mapOrders.put(6, putOrder);
				break;
			case 7:
				putOrder.add(allOrder);
				mapOrders.put(7, putOrder);
				break;
			case 8:
				putOrder.add(allOrder);
				mapOrders.put(8, putOrder);
				break;
			case 9:
				putOrder.add(allOrder);
				mapOrders.put(9, putOrder);
				break;
			case 10:
				putOrder.add(allOrder);
				mapOrders.put(10, putOrder);
				break;
			case 11:
				putOrder.add(allOrder);
				mapOrders.put(11, putOrder);
				break;
			case 12:
				putOrder.add(allOrder);
				mapOrders.put(12, putOrder);
				break;
			default:
				break;
			}
			System.out.println(j);
		}
		//System.out.println("1");
		return mapOrders;
	}
	/**
	 * 获取用户的服务订单
	 * @return
	 */
	@RequestMapping("serviceUser")
    @ResponseBody
	public List getServiceOrder(String id) {
		List<AllOrder> serviceOrders=allOrderService.getServiceOrder(id);
		return serviceOrders;
	}
}
