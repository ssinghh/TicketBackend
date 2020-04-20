package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complaint {
private String cusName;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer comNo;

private String comDesc;

public String getCusName() {
	return cusName;
}

public Integer getComNo() {
	return comNo;
}

public String getComDesc() {
	return comDesc;
}



public void setCusName(String cusName) {
	this.cusName = cusName;
}
public void setComNo(Integer comNo) {
	this.comNo = comNo;
}
public void setComDesc(String comDesc) {
	this.comDesc = comDesc;
}


@Override
public String toString() {	
	return cusName + " " + comNo + " " + comDesc;
}

}
