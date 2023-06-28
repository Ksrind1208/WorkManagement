package com.example.WorkManagement;

import java.util.Objects;

public class Todo {
	private String title;
	private String detail;
	public Todo() {
		
	}
	public Todo(String title,String detail) {
		this.title=title;
		this.detail=detail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public int hashCode() {
		return Objects.hash(detail, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(detail, other.detail) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Todo [title=" + title + ", detail=" + detail + "]";
	}
	
	
}
