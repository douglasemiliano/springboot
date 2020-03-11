package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ServicoProdutos {
  public ServicoProdutos() {
    System.out.println(
      "Criado ServicoProdutos");
  }	
  public String ola() {
    return "<h1> Ola </h1>";
	}
}
