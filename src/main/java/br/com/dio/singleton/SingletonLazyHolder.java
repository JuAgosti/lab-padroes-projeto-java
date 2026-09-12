package br.com.dio.singleton;

/**
 * Singleton Lazy Holder: Variação que combina o carregamento sob demanda (lazy)
 * com o gerenciamento de concorrência nativo do Java (thread-safe).
 * Ela utiliza uma classe estática interna para armazenar a instância, garantindo
 * a criação única e segura sem precisar de bloqueios explícitos como synchronized.
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
