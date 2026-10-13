
package com.kaiquesouzasantos.baozistoreapi.dto;

public record PedidoRequestDTO(
        Long clienteId,
        Long produtoId,
        Integer quantidade
) {
}
