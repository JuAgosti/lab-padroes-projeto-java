package br.com.dio.strategy;
/*Funciona como um contrato. Ela estabelece o método mover(),
 * garantindo que qualquer classe que a implemente saiba como
 * executar um movimento, independente de qual seja o estilo desse movimento.
 */
public interface Comportamento {
    void mover();
}
