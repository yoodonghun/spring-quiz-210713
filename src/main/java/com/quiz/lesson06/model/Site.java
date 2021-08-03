package com.quiz.lesson06.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class Site {
   private String name;
   private String url;
   private Date createdAt;
   private Data updatedAt;
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Data getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Data updatedAt) {
	this.updatedAt = updatedAt;
}
   
   

}
