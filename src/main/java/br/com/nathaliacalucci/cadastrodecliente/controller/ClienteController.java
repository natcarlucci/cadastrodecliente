package br.com.nathaliacalucci.cadastrodecliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	@GetMapping(path = "/consultarClientes")
	public String consultarCliente() {
		return "Hello World";
	}
}
