package com.everis.steps;

import com.everis.pages.ResultadoPesquisaPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {

	@Quando("adiciona o produto {string} ao carrinho")
	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
	}

	@E("acesso o produto {string}")
	public void acessarProduto(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.acessarProduto(nomeProduto);
	}
}