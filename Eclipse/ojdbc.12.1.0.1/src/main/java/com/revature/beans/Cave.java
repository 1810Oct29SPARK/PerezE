package com.revature.beans;

public class Cave {
	
	public Cave(int id, String name, int maxbears) {
		super();
		this.id = id;
		this.name = name;
		this.maxbears = maxbears;
	}
	public Cave() {
	}
	
	private int id;
	private String name;
	private int maxbears;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxbears() {
		return maxbears;
	}
	public void setMaxbears(int maxbears) {
		this.maxbears = maxbears;
	}
	@Override
	public String toString() {
		return "Cave [id=" + id + ", name=" + name + ", maxbears=" + maxbears + "]";
	}

}
