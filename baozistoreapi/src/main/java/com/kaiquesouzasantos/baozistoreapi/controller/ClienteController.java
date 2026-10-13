
package com.kaiquesouzasantos.baozistoreapi.controller;

import com.kaiquesouzasantos.baozistoreapi.model.ClienteModel;
import com.kaiquesouzasantos.baozistoreapi.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ClienteModel> criar(@RequestBody ClienteModel cliente) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.criar(cliente));
    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
