package Boardgame;

public class BoadException extends  RuntimeException{ //programação defensiva
    private static  final long serialversionUID = 1L;

    public BoadException(String msg) { //construtor que repassa a mensagem para o construtor da super classe que é o RuntimeException
        super(msg);
    }
}
