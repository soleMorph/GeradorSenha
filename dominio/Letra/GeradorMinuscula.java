package GeradorDeSenha.dominio.Letra;
import java.util.Random;

public class GeradorMinuscula {

    protected static char geradorMinuscula(){      //método para retornar chars
        Random random=new Random();    //importação da classe Random
        char wordRandomMinusculas=(char) (random.nextInt(26)+'a');  //declarção da variável char e inicio do objeto random
        return wordRandomMinusculas;
    }
}
