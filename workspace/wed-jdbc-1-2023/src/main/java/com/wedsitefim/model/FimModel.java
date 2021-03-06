package com.wedsitefim.model;

import java.util.ArrayList;
import java.util.List;

public class FimModel {
	
	private Long id;
	private String tenFim;
	private String fileFim;
	private String fileTrailer;
	private String poster;
	private Long theloaiId;
	private Long danhmucId;
	private String dienvien;
	private String fimday;
	private Long sotap;
	private String quocgia;
	private String noidung;
	private List<FimModel> listResultFim = new ArrayList<>();
	private Integer page;
	private Integer maxPageItem;
	private Integer totalPage;
	private Integer totalItem;
	
	
	
	public Integer getPage() {
		return page;
	}
	public Integer getMaxPageItem() {
		return maxPageItem;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public Integer getTotalItem() {
		return totalItem;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public void setMaxPageItem(Integer maxPageItem) {
		this.maxPageItem = maxPageItem;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}
	public List<FimModel> getListResultFim() {
		return listResultFim;
	}
	public void setListResultFim(List<FimModel> listResultFim) {
		this.listResultFim = listResultFim;
	}
	public String getFimday() {
		return fimday;
	}
	public Long getSotap() {
		return sotap;
	}
	public String getQuocgia() {
		return quocgia;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setFimday(String fimday) {
		this.fimday = fimday;
	}
	public void setSotap(Long sotap) {
		this.sotap = sotap;
	}
	public void setQuocgia(String quocgia) {
		this.quocgia = quocgia;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public Long getId() {
		return id;
	}
	public Long getTheloaiId() {
		return theloaiId;
	}
	public Long getDanhmucId() {
		return danhmucId;
	}
	public String getDienvien() {
		return dienvien;
	}
	public void setTheloaiId(Long theloaiId) {
		this.theloaiId = theloaiId;
	}
	public void setDanhmucId(Long danhmucId) {
		this.danhmucId = danhmucId;
	}
	public void setDienvien(String dienvien) {
		this.dienvien = dienvien;
	}
	public String getFileFim() {
		return fileFim;
	}
	public String getFileTrailer() {
		return fileTrailer;
	}
	public String getPoster() {
		return poster;
	}
	public void setFileFim(String fileFim) {
		this.fileFim = fileFim;
	}
	public void setFileTrailer(String fileTrailer) {
		this.fileTrailer = fileTrailer;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTenFim() {
		return tenFim;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTenFim(String tenFim) {
		this.tenFim = tenFim;
	}
	
}

