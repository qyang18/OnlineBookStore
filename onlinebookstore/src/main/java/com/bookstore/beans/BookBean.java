package com.bookstore.beans;

public class BookBean {
	String kind;
	String id;
	aaData aaData;
	int length;

	public BookBean(String kind, String id, aaData aaData, int length) {
		super();
		this.kind = kind;
		this.id = id;
		this.aaData = aaData;
		this.length=length;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public aaData getAaData() {
		return aaData;
	}

	public void setAaData(aaData aaData) {
		this.aaData = aaData;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
