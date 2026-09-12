package br.com.dio.facade.subsistema.cep;
// API para consultar cidade e estado a partir de um CEP.

public class CepApi{
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String RecuperarCidade(String cep){
        return "Cep tal";
    }

    public String RecuperarEstado(String cep){
        return "Estado tal";
    }
}
