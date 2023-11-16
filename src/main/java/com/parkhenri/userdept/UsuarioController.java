package com.parkhenri.userdept;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @GetMapping
    public ResponseEntity<Usuario> getUsuario(){
        final Usuario usuario = new Usuario("Park Henri", 24, "Desenvolvedor");
        return ResponseEntity.ok(usuario);
    }
}

