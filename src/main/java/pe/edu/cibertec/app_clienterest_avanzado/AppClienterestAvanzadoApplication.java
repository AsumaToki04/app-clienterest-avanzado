package pe.edu.cibertec.app_clienterest_avanzado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppClienterestAvanzadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppClienterestAvanzadoApplication.class, args);
	}

}
