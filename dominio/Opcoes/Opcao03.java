package GeradorDeSenha.dominio.Opcoes;

public class Opcao03 extends Opcoes{
    Opcao03(){
        letra_carac();
    }
    public void letra_carac(){
        char[] letras;
        char[] caracter;
        letras=letras();
        caracter=caracteres();
        for(int i=0;i<letras.length;i++){
            System.out.print(letras[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<caracter.length;i++){
            System.out.print(caracter[i]+", ");
        }
    }
}
