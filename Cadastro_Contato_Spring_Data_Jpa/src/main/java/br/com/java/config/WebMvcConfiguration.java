package br.com.java.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.java.controller.ContatoController;
import br.com.java.repository.ContatoRepository;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@ComponentScan(basePackageClasses={ContatoController.class, ContatoRepository.class})
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {
	@Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.addBasenames("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/contato").setViewName("Contato");
        registry.addViewController("/").setViewName("layout");
//        registry.addViewController("/lista").setViewName("lista");
//        registry.addViewController("/login").setViewName("login");
    }

}
