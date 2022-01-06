package com.braindatawire.companymanagement.model;

public class Team 
{
	private int tid;
	private String tname;
	Manager m;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Manager getM() {
		return m;
	}
	public void setM(Manager m) {
		this.m = m;
	}
	

}
