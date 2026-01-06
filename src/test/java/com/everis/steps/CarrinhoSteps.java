package com.everis.steps;

import org.junit.Assert;

import com.everis.pages.CarrinhoPage;

import io.cucumber.java.pt.Entao;

public class CarrinhoSteps {
	
	@Entao("o produto {string} deve estar presente no carrinho")
	public void apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho", 
				carrinhoPage.apresentouProdutoEsperadoNoCarrinho(nomeProduto));
	}

	@Entao("o produto {string} deve possuir a quantidade {string}")
	public void oProdutoApresentouQuantidadeEsperada(String nomeProduto, String quantidade) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("O produto [" + nomeProduto + "]deveria ter a quantidade [" + quantidade + "]", false);
			carrinhoPage.oProdutoApresentouQuantidadeEsperada(nomeProduto, quantidade);
	}
	
}