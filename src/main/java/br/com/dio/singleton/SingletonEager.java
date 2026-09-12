package br.com.dio.singleton;
/**
 * Singleton Eager (Apressado): A instância da classe é criada antecipadamente no
 * momento em que a classe é carregada pela JVM. É indicado para cenários onde a
 * instância é simples de criar e será utilizada com certeza durante a execução.
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
