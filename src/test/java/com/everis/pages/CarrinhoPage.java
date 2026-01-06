package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {
	
	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

    public boolean oProdutoApresentouQuantidadeEsperada(String nomeProduto, String quantidade) {
		WebElement quantidadeProduto = driver.findElement(By.xpath("//*[text()='" + nomeProduto + "']//ancestor::*[contains(@class, 'cart_item')]//*[@class, 'cart_quantity_input')]"));
		boolean oProdutoApresentouQuantidadeEsperada = quantidade.equals(quantidadeProduto.getAttribute("value"));
		if(oProdutoApresentouQuantidadeEsperada) {
			log("O produto [" + nomeProduto + "] apresentou a quantidade [" + quantidade + "] conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado outra quantidade para o produto [" + nomeProduto + "].");
		return false;
    }
}