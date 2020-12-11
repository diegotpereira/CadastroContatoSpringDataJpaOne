package br.com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"br.com.java", "Controller", "Service"})
//@ComponentScan({"br.com.java"})
public class CadastroContatoSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroContatoSpringDataJpaApplication.class, args);
	}

}
