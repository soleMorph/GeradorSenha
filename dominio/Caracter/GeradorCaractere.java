package GeradorDeSenha.dominio.Caracter;

import java.util.Random;

public class GeradorCaractere {
    protected static char geradorCaracter(){
        Random random = new Random();
        String setOfCharacters = "!@#$%&*()/+=-_;:><|}{\\";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        return randomChar;
    }
}
