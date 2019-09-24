package com.entor.entity;

import java.sql.Timestamp;
import java.util.List;

public class Order {

	private int id;
	private String receiveName;
	private String receiveAddress;
	private String receivePhone;
	private Timestamp createTime;
	private List<OrderProduct> orderProducts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public String getReceivePhone() {
		return receivePhone;
	}
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", receiveName=" + receiveName + ", receiveAddress=" + receiveAddress
				+ ", receivePhone=" + receivePhone + ", createTime=" + createTime + "]";
	}
}
