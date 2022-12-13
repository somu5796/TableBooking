package com.generaltemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.generaltemplate.demorest,com.generaltemplate.Interface,com.generaltemplate.managerImpl.ManagerImpl,com.generaltemplate.demodao")
public class GeneralTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralTemplateApplication.class, args);
	}

}
