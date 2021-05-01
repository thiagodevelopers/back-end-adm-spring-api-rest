package br.com.arrecadacao.microservice.arrecadacao.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arrecadacao.microservice.arrecadacao.model.InfoRemessa;
import br.com.arrecadacao.microservice.arrecadacao.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/nome/{nomearquivo}")
	public List<InfoRemessa> getInfoPorNomeArquivo(@PathVariable String nomearquivo) {
		return infoService.getInfoPorNomeArquivo(nomearquivo);
	}
	
	@RequestMapping("/tipo/{tipoarquivo}")
	public List<InfoRemessa> getInfoPorTipoArquivo(@PathVariable String tipoarquivo) {
		return infoService.getInfoPorTipoArquivo(tipoarquivo);
	}
	
	@RequestMapping("/data/{data}")
	public List<InfoRemessa> getInfoPorTipoArquivo(@PathVariable Date data) {
		return infoService.getInfoPorData(data);
	}	
}