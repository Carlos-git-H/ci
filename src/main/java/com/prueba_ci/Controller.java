package com.prueba_ci;


@RestController
public class Controller {

    @GetMapping("/hola")
    public String saludar() {
        String mensaje = "Hola desde Spring Boot"
        return mensaje;
    }
}
