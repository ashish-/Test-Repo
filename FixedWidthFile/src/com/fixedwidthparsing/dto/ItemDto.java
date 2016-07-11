package com.fixedwidthparsing.dto;

public class ItemDto {
Integer fclty_nbr;
Integer dept_nbr;
String bill_cod;
String bill_cod_desc;
Float vol_qty;
String post_date;
String svc_date;
public Integer getFclty_nbr() {
	return fclty_nbr;
}
public void setFclty_nbr(Integer fclty_nbr) {
	this.fclty_nbr = fclty_nbr;
}
public Integer getDept_nbr() {
	return dept_nbr;
}
public void setDept_nbr(Integer dept_nbr) {
	this.dept_nbr = dept_nbr;
}
public String getBill_cod() {
	return bill_cod;
}
public void setBill_cod(String bill_cod) {
	this.bill_cod = bill_cod;
}
public String getBill_cod_desc() {
	return bill_cod_desc;
}
public void setBill_cod_desc(String bill_cod_desc) {
	this.bill_cod_desc = bill_cod_desc;
}
public Float getVol_qty() {
	return vol_qty;
}
public void setVol_qty(Float vol_qty) {
	this.vol_qty = vol_qty;
}
public String getPost_date() {
	return post_date;
}
public void setPost_date(String post_date) {
	this.post_date = post_date;
}
public String getSvc_date() {
	return svc_date;
}
public void setSvc_date(String svc_date) {
	this.svc_date = svc_date;
}
}
