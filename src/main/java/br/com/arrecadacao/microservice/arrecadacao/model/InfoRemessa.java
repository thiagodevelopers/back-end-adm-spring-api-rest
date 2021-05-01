package br.com.arrecadacao.microservice.arrecadacao.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class InfoRemessa {

	@ApiModelProperty(value = "Código do Arquivo")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ApiModelProperty(value = "Nome do Arquivo")
	private String nomeArquivo;
	
	@ApiModelProperty(value = "Tipo do Arquivo")
	private String tipoArquivo;
	
	@ApiModelProperty(value = "Data do Arquivo")
	private Date data;
	
	@ApiModelProperty(value = "Quantidade de Linhas")
	private int quantLinhas;
	
	@ApiModelProperty(value = "Valor Total")
	private double valorTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getQuantLinhas() {
		return quantLinhas;
	}

	public void setQuantLinhas(int quantLinhas) {
		this.quantLinhas = quantLinhas;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
