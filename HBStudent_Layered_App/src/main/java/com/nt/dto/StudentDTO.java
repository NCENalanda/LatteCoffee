package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private String name;
	private int rank;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", rank=" + rank + ", id=" + id + "]";
	}
	
}
