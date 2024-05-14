package _exemplos.padrao.design;

public class SingletonTeste {
    
    public static void main(String[] args) {
        
        Singleton primeiro;
        Singleton segundo;
        
        primeiro = Singleton.getInstance();
        segundo = Singleton.getInstance();
        
        System.out.println( primeiro == segundo );
        
    }    
}
