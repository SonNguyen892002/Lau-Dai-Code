package com.wedsitefim.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AbstractModel<T> {
	
	private Long id;
	private long[] ids;
	private List<T> listResult = new ArrayList<>();
	
	
	public long[] getIds() {
		return ids;
	}
	public List<T> getListResult() {
		return listResult;
	}
	public void setIds(long[] ids) {
		this.ids = ids;
	}
	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
