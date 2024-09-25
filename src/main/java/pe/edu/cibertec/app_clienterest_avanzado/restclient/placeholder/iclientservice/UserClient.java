package pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.User;

@FeignClient(name = "userClient",
url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

    @GetMapping("/users/{id}")
    User obtenerUsuarioXid(
            @PathVariable("id") Long id,
            //Cuando la petición del cliente envia el token
            @RequestHeader("Authorization") String token);
}
