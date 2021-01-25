package com.algaworks.osworks.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrdemServicoInput {
	
	@NotBlank
	private String descricaol;
	
	@NotNull
	private BigDecimal preco;
	
	@Valid
	@NotNull
	private Long clienteId;
	private ClienteIdInput cliente;

	public String getDescricaol() {
		return descricaol;
	}

	public void setDescricaol(String descricaol) {
		this.descricaol = descricaol;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public ClienteIdInput getCliente() {
		return cliente;
	}

	public void setCliente(ClienteIdInput cliente) {
		this.cliente = cliente;
	}

}
