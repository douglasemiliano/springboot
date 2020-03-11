package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ControladorProdutos {
	
	@Autowired
	private ServicoProdutos servicoProdutos;
	
	public ControladorProdutos() {
	    System.out.println("Criado ControladorProdutos");
		  }
	
	@RequestMapping ("/mensagem")
	@ResponseBody
	public String ola() {
		return servicoProdutos.ola();
	}
	

}


