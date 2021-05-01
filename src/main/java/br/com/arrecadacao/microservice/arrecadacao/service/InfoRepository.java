package br.com.arrecadacao.microservice.arrecadacao.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.arrecadacao.microservice.arrecadacao.model.InfoRemessa;

@Repository
public interface InfoRepository extends CrudRepository<InfoRemessa, Long> {

	List<InfoRemessa> findByNomeArquivo(String nomeArquivo);
	List<InfoRemessa> findByTipoArquivo(String tipoArquivo);
	List<InfoRemessa> findByData(Date data);
}
