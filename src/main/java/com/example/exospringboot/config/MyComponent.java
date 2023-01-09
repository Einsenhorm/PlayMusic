package com.example.exospringboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.exospringboot.service.Music;

@Component
public class MyComponent {
		
	@Autowired
	
	private Music music;
	
	public void Play() {
		System.out.println( music.playMusic());
	}
	
	
}
