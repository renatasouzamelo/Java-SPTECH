package sptech.projeto02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/") // indica o inicio de todas as URIs da chamadas nesta classe
public class SptechProjeto02Application {

	public static void main(String[] args) {
		SpringApplication.run(SptechProjeto02Application.class, args);

	}

}
