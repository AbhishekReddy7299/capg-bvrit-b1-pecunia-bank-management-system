package com.capg;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class App {

	 public static void main( String[] args )

	    {

	      ApplicationContext context=new AnnotationConfigApplicationContext(Configurations.class);
	      
	      Trainee t=(Trainee) context.getBean("trainee");
	       t.display();
	    }
	
}