package pe.edu.cibertec.app_clienterest_avanzado.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.User;
import pe.edu.cibertec.app_clienterest_avanzado.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/usuario/{id}")
    public User obtenerUsuarioXid(
            @PathVariable("id") Long id) {
        return userService.obtenerUsuarioXid(id);
    }
}
