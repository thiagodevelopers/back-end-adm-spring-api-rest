package br.com.arrecadacao.microservice.arrecadacao.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.arrecadacao.microservice.arrecadacao.model.InfoRemessa;
import br.com.arrecadacao.microservice.arrecadacao.service.InfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/info")
@Api(value = "arrecadacao")
public class InfoController {
	
	@Autowired
	private InfoService infoService;

	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de arquivos por nome"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value = "Lista arquivos por nome")
	@RequestMapping(value = "/nome/{nomearquivo}", method = RequestMethod.GET, produces="application/json")
	public List<InfoRemessa> getInfoPorNomeArquivo(@PathVariable String nomearquivo) {
		return infoService.getInfoPorNomeArquivo(nomearquivo);
	}
		
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de arquivos por tipo"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value = "Lista arquivos por tipo")
	@RequestMapping(value = "/tipo/{tipoarquivo}", method = RequestMethod.GET, produces="application/json")
	public List<InfoRemessa> getInfoPorTipoArquivo(@PathVariable String tipoarquivo) {
		return infoService.getInfoPorTipoArquivo(tipoarquivo);
	}
	
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de arquivos por data"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value = "Lista arquivos por data (yyyy-mm-dd)")
	@RequestMapping(value = "/data/{data}", method = RequestMethod.GET, produces="application/json")
	public List<InfoRemessa> getInfoPorTipoArquivo(@PathVariable Date data) {
		return infoService.getInfoPorData(data);
	}	
}