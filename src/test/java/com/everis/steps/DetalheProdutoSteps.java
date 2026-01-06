package com.everis.steps;

import com.everis.pages.DetalheProdutoPage;

import io.cucumber.java.pt.E;

public class DetalheProdutoSteps {
    @E("aumento a quantidade de produto")
    public void aumentarQuantidadeProduto() {
        DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
        detalheProdutoPage.aumentarQuantidadeProduto();
    }
}