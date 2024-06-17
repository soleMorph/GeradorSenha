package GeradorDeSenha.dominio.Opcoes;

import java.util.Scanner;

import GeradorDeSenha.dominio.Caracter.EntradaCaractere;
import GeradorDeSenha.dominio.Numero.EntradaNumero;

public class Opcao01 extends Opcoes{
    //numeros e caractere
    Opcao01(){
        letra_caractere();
    }
    public void letra_caractere(){
        Scanner scan=new Scanner(System.in);
        EntradaNumero numero=new EntradaNumero();
        EntradaCaractere caractere=new EntradaCaractere();
        char[] arrayCaractere;
        char[] arrayNumero;
        System.out.print("Digite a quantidade de números: (Máximo de 10 números)\n>>");
        int numNumeros=scan.nextInt();
        System.out.println("");
        arrayNumero=numero.entradaNumero(numNumeros);
        System.out.print("Digite a quantidade de caracteres: (Máximo de 22)\n>>");
        int numCaractere=scan.nextInt();
        System.out.println("");
        arrayCaractere=caractere.entrada(numCaractere);
        for(int i=0;i<arrayNumero.length;i++){
            System.out.print(arrayNumero[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<arrayCaractere.length;i++){
            System.out.print(arrayCaractere[i]+", ");
        }
    }

    public void exibir(){
        char[] letras;
        char[] caracteres;
        letras=letras();
        caracteres=caracteres();
    }
}
