package com.clive.bean;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.druid.pool.DruidDataSource;

public class Student implements Serializable{
	private int id;
	private String username;
	private int age;
	private double score;
	private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", age=" + age + ", score=" + score + ", created=" + created
				+ "]";
	}

}
