package com.youtube.model;

import java.util.Date;

public class Video {

	private String title;
	private String commnet;
	private Date uploadAt;
	private int count; // views
	private String imgUrl;
	private String fileUrl;
	
	public Video() {
	}
	public Video(String title, String commnet, Date uploadAt, int count, String imgUrl, String fileUrl) {
		this.title = title;
		this.commnet = commnet;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCommnet() {
		return commnet;
	}
	public void setCommnet(String commnet) {
		this.commnet = commnet;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", commnet=" + commnet + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + "]";
	}
	
	
	
	
	
}
