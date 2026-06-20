package com.prueba_ci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller2 {
    @GetMapping("/hola")
    public String saludar() {
        String mensaje = "Hola desde Spring Boot con error"
        return mensaje;
    }
}
