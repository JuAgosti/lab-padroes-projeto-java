package br.com.dio.strategy;
/* O robô mantém uma referência para a interface Comportamento.
 *Ele não precisa saber os detalhes de como cada tipo de movimento funciona,
 * ele apenas chama o método mover() da estratégia que estiver definida no momento via setComportamento().
 */

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
