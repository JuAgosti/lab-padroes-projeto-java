package br.com.dio.singleton;
/**
 * Singleton Lazy (Preguiçoso): A instância da classe só é criada no momento
 * em que é solicitada pela primeira vez (getInstancia()). É ideal para economizar memória
 * quando a criação do objeto é pesada e pode não ser necessária logo no início da aplicação.
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
