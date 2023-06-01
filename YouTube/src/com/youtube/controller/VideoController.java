package com.youtube.controller;

import com.youtube.model.User;
import com.youtube.model.Video;

public class VideoController  implements UserControllerImpl{

	@Override
	public boolean login() {
		return false;
	}

	@Override
	public boolean signUp() {
		return false;
	}

	@Override
	public User viewProfile() {
		return null;
	}

	@Override
	public User updateProfile() {
		return null;
	}

	@Override
	public boolean delelteProfile() {
		return false;
	}
	
	/*
	 * Create : 추가
	 * Read : 읽기(1개, 목록)
	 * Update : 수정
	 * Delete: 삭제
	 */
	
	

	// 영상 업로드
	// 영상 목록
	// 영상 1개 보기
	// 동영상 수정
	// 동영상 삭제
}
