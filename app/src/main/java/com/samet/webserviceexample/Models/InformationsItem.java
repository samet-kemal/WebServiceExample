package com.samet.webserviceexample.Models;

public class InformationsItem{
	private int id;
	private String title;
	private String body;
	private int userId;

	@Override
	public String toString() {
		return "InformationsItem{" +
				"id=" + id +
				", title='" + title + '\'' +
				", body='" + body + '\'' +
				", userId=" + userId +
				'}';
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getBody(){
		return body;
	}

	public String userIDtoString() {
		return "InformationsItem{" +
				"userId=" + userId +
				'}';
	}
	public String idtoString() {
		return "InformationsItem{" +
				"userId=" + id +
				'}';
	}

	public int getUserId(){
		return userId;
	}

}
