package com.app.entity;
/**
 * 服务订单
 * @author 李洋
 *
 */
public class AllOrder {

	private String id;//订单id
	private String userName;//用户姓名
	private String userIphone;//用户电话
	private String orderType;//订单类型
	private String serviceAddress;//服务地址
	private Double price;//服务价格
	private String orderTime;//订单时间
	private String serviceTime;//服务时间
	private String serviceStatus;//服务状态
	private String period;//周期
	private String prepay;//预支付
	private String discount;//折扣
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userIphone
	 */
	public String getUserIphone() {
		return userIphone;
	}
	/**
	 * @param userIphone the userIphone to set
	 */
	public void setUserIphone(String userIphone) {
		this.userIphone = userIphone;
	}
	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * @return the serviceAddress
	 */
	public String getServiceAddress() {
		return serviceAddress;
	}
	/**
	 * @param serviceAddress the serviceAddress to set
	 */
	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the orderTime
	 */
	public String getOrderTime() {
		return orderTime;
	}
	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	/**
	 * @return the serviceTime
	 */
	public String getServiceTime() {
		return serviceTime;
	}
	/**
	 * @param serviceTime the serviceTime to set
	 */
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	/**
	 * @return the serviceStatus
	 */
	public String getServiceStatus() {
		return serviceStatus;
	}
	/**
	 * @param serviceStatus the serviceStatus to set
	 */
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	/**
	 * @return the period
	 */
	public String getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(String period) {
		this.period = period;
	}
	/**
	 * @return the prepay
	 */
	public String getPrepay() {
		return prepay;
	}
	/**
	 * @param prepay the prepay to set
	 */
	public void setPrepay(String prepay) {
		this.prepay = prepay;
	}
	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
}
