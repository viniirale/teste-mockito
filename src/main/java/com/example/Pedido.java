package com.example;

import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;
    private DescontoService descontoService;

    public Pedido(List<ItemPedido> itens, DescontoService descontoService) {
        this.itens = itens;
        this.descontoService = descontoService;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (ItemPedido item : itens) {
            valorTotal += item.getSubtotal();
        }

        double desconto = descontoService.calcularDesconto(valorTotal);
        return valorTotal - desconto;
    }
}