package br.com.dio.facade;

import br.com.dio.facade.subsistema.cep.CepApi;
import br.com.dio.facade.subsistema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().RecuperarCidade(cep);
        String estado = CepApi.getInstancia().RecuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
