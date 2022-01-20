package com.wedsitefim.model;

import java.util.ArrayList;
import java.util.List;

public class TheloaiModel {
	private Long id;
	private String theLoai;
	private List<TheloaiModel> listResultTheloai = new ArrayList<>();
	
	public List<TheloaiModel> getListResultTheloai() {
		return listResultTheloai;
	}
	public void setListResultTheloai(List<TheloaiModel> listResultTheloai) {
		this.listResultTheloai = listResultTheloai;
	}
	public Long getId() {
		return id;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	
	
}
