package com.example.exospringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.exospringboot.service.Guitare;
import com.example.exospringboot.service.Music;
import com.example.exospringboot.service.Ukulele;


@Configuration 
@ComponentScan ({"com.example.exospringboot.*"})
public class AppConfig {
	
	@Bean (name="music")
	public Music getMusic() {
		return new Guitare();
	}
	
	@Bean (name="music2")
	public Music getMusic2() {
		return new Ukulele();
	}
}
