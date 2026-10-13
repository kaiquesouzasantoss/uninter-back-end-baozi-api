
package com.kaiquesouzasantos.baozistoreapi.controller;

import com.kaiquesouzasantos.baozistoreapi.dto.PedidoRequestDTO;
import com.kaiquesouzasantos.baozistoreapi.model.PedidoModel;
import com.kaiquesouzasantos.baozistoreapi.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PedidoModel> criar(
            @RequestBody PedidoRequestDTO dto
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.criar(dto));
    }

    @GetMapping
    public ResponseEntity<List<PedidoModel>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoModel> buscarPorId(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(
            @PathVariable Long id
    ) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
