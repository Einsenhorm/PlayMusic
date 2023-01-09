package com.example.exospringboot.Exo_Spring_Boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.exospringboot.service.Guitariste;
import com.example.exospringboot.service.Music;
import com.example.exospringboot.config.AppConfig;
import com.example.exospringboot.config.MyComponent;

public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    
    Guitariste guitariste = (Guitariste) context.getBean("guitariste");
    guitariste.playMusic();
    
    System.out.println("---------------");
    
    MyComponent compo = context.getBean("myComponent", MyComponent.class);
    compo.Play();
    
    	
    }
}
