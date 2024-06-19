package GeradorDeSenha.dominio.Opcoes;

public class Opcao01 extends Opcoes{
    //numeros e caractere
    Opcao01(){
        letra_caractere();
    }
    public void letra_caractere(){
        char[] numeros;
        char[] caracteres;
        numeros=numeros();
        caracteres=caracteres();
        for (char n : numeros) {
            System.out.print(n+", ");
        }
        System.out.println("");
        for (char c : caracteres) {
            System.out.print(c+", ");
        }
    }

    public void exibir(){
        char[] letras;
        char[] caracteres;
        letras=letras();
        caracteres=caracteres();
    }
}
