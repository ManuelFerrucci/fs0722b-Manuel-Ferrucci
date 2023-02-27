package com.example.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pizzeria.model.Birra;
import com.example.pizzeria.model.ConfigurationPizzeria;
import com.example.pizzeria.model.PizzaNormale;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);

		configWith_Beans_pizzeria();
	}

	public static void configWith_Beans_pizzeria() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationPizzeria.class);
		try {

			// Recupero Bean
			PizzaNormale pizzaMarinara = (PizzaNormale) appCtx.getBean("marinara");
			PizzaNormale pizzaQuattroStagioni = (PizzaNormale) appCtx.getBean("quattroStagioni");
			Birra birraMoretti = (Birra) appCtx.getBean("birMoretti");
			
			System.out.println("Menu");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Pizze:");
			System.out.println(pizzaMarinara);
			System.out.println(pizzaQuattroStagioni);
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Bibite:");
			System.out.println(birraMoretti);
			System.out.println("-------------------------------------------------------------------------");

		} catch (Exception e) {
			e.getMessage();
		} finally {
			((AnnotationConfigApplicationContext) appCtx).close();
		}

	}

}
