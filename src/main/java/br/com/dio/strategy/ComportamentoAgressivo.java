package br.com.dio.strategy;

// São as estratégias concretas. Cada uma delas define uma forma específica de executar a ação mover().
public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Se movendo agressivamente...");
    }
}
