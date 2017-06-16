package com.mobitel.MobitelBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Product 
{
@Id
@GeneratedValue
int prodid;
String ProductName;
int Catid,suppid,quentity,price;
String ProDesc;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getCatid() {
	return Catid;
}
public void setCatid(int catid) {
	Catid = catid;
}
public int getSuppid() {
	return suppid;
}
public void setSuppid(int suppid) {
	this.suppid = suppid;
}
public int getQuentity() {
	return quentity;
}
public void setQuentity(int quentity) {
	this.quentity = quentity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getProDesc() {
	return ProDesc;
}
public void setProDesc(String proDesc) {
	ProDesc = proDesc;
}
}
