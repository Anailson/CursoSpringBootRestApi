package curso.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*ANOTAÇÕES NECESSÁRIOS PARA O PROJETO SPRING REST API*/
@SpringBootApplication
@EntityScan(basePackages = {"curso.api.rest.model"})
@ComponentScan(basePackages = {"curso."})
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class CursospringbootrestapiApplication  implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(CursospringbootrestapiApplication.class, args);
	   // System.out.println(new BCryptPasswordEncoder().encode("123"));
	    //$2a$10$jUrWIBAjhbpqRxe4nBBjqu02LCmq6SZFYaNBUGJ1fc8NAz59oFIFi
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/usuario**/")//LIBERANDO AÇÕES PARA O addMapping
		.allowedOrigins("*")//LIBERANDO TODAS AS FUNÇÕE DA API
		.allowedOrigins("*");//LIBERANDO O MAPEAMENTO DE USUARIOS PARA TODAS AS ORIGENS DA API
	}
	
	

}
