package com.youtube.model;

import java.util.Date;
import java.util.List;

public class Video {

	private String title;
	private String commnet;
	private Date uploadAt;
	private int count; // views
	private String imgUrl;
	private String fileUrl;
	private String desc;
	private char kind; // shorts & video 둘 중 하나!
	
	private List<Comment> comments;
	private Category category;
}
