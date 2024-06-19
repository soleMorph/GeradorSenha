package GeradorDeSenha.dominio.Opcoes;

// import java.util.Scanner;
// import org.apache.commons.lang3.ArrayUtils;

//combinação de números e letras
public class Opcao02 extends Opcoes{
    Opcao02(){
        letra_numero();
    }
    public void letra_numero(){
        char[] numeros;
        char[] letras;
        numeros=numeros();
        letras=letras();
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<letras.length;i++){
            System.out.print(letras[i]+", ");
        }
    }
}
