package br.com.arrecadacao.microservice.arrecadacao.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arrecadacao.microservice.arrecadacao.model.InfoRemessa;


@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;
	
	public List<InfoRemessa> getInfoPorNomeArquivo(String nomeArquivo) {		
		return infoRepository.findByNomeArquivo(nomeArquivo);		
	}
	
	public List<InfoRemessa> getInfoPorTipoArquivo(String tipoArquivo) {		
		return infoRepository.findByTipoArquivo(tipoArquivo);		
	}
	
	public List<InfoRemessa> getInfoPorData(Date data) {		
		return infoRepository.findByData(data);		
	}
}
