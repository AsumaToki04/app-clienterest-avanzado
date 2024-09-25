package pe.edu.cibertec.app_clienterest_avanzado.restclient.errorhandler;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        return switch (status) {
            case NOT_FOUND -> new ResponseStatusException(HttpStatus.NOT_FOUND, "El recurso no fue encontrado");
            case BAD_REQUEST -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Solicitud incorrecta al API");
            default -> new Exception("Error desconocido " + status);
        };
    }
}
