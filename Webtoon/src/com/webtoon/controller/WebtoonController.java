package com.webtoon.controller;

import java.util.ArrayList;
import java.util.List;

import com.webtoon.model.User;
import com.webtoon.model.Webtoon;

public class WebtoonController {

	private List<Webtoon> webtoonList;

	public WebtoonController(){
		webtoonList = new ArrayList<>();
	}
	public void addWebtoon(Webtoon webtoon) {
		webtoonList.add(webtoon);
	}
	public Webtoon viewWebtoon(String title) {
		for(Webtoon webtoon : webtoonList) {
			if(webtoon.getTitle().equals(title)) {
				return webtoon;
			}
		}
		return null;
	}
	public boolean updateWebtoon(String title, String newTitle, String newGenre, String newWriter) {
		for(Webtoon webtoon : webtoonList) {
			if(webtoon.getTitle().equals(title)) {
				webtoon.setTitle(newTitle);
				webtoon.setGenre(newGenre);
				webtoon.setWriter(newWriter);
				return true;
			}
		}
		return false;
	}
	public boolean deleteWebtoon(String title) {
		for(Webtoon webtoon : webtoonList) {
			if(webtoon.getTitle().equals(title)) {
				webtoonList.remove(webtoon);
				return true;
			}
		}
		return false;
	}
	public List<Webtoon> getAllWebtoons() {
		return webtoonList;
	}
}
