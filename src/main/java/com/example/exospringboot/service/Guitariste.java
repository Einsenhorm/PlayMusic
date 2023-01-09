package com.example.exospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Guitariste {

	@Autowired
	private Music music;
	
	public Guitariste () {
	}
	
	public void playMusic() {
		System.out.println(" Musique : " + music.playMusic());
	}
}
