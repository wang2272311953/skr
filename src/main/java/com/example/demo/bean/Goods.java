package com.example.demo.bean;

import java.io.Serializable;

public class Goods implements Serializable{
	private int gid;
	private String gname;
	private double price;
	private int gcount;
	private int saleCount;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getGcount() {
		return gcount;
	}
	public void setGcount(int gcount) {
		this.gcount = gcount;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", gcount=" + gcount + ", saleCount="
				+ saleCount + "]";
	}
	public Goods(int gid, String gname, double price, int gcount, int saleCount) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.gcount = gcount;
		this.saleCount = saleCount;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
