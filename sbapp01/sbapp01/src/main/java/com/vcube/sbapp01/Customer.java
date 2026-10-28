package com.vcube.sbapp01;

import org.springframework.stereotype.Component;

@Component
public class Customer {
int cid;
 String cname;
 public int getCid() {
	return cid;
 }
 public void setCid(int cid) {
	this.cid = cid;
 }
 public String getCname() {
	return cname;
 }
 public void setCname(String cname) {
	this.cname = cname;
 }
  
}
