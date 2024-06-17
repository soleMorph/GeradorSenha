package GeradorDeSenha.dominio.Numero;
import java.util.Random;

public class GeradorNumero {
    protected char geradorNumero(){
        Random random=new Random();
        int numRandom=(random.nextInt(10)); 
        String converter;
        converter=numRandom+"";
        char charRandom=converter.charAt(0);
        return charRandom;
    }
}
