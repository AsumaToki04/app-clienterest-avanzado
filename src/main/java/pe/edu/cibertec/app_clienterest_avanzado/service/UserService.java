package pe.edu.cibertec.app_clienterest_avanzado.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.User;
import pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.iclientservice.UserClient;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserClient userClient;

    public User obtenerUsuarioXid(Long id) {
        return userClient.obtenerUsuarioXid(id, "Bearer aqui_token");
    }
}
