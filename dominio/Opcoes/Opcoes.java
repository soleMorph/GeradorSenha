package GeradorDeSenha.dominio.Opcoes;

import java.util.Scanner;

import GeradorDeSenha.dominio.Caracter.EntradaCaractere;
import GeradorDeSenha.dominio.Letra.EntradaLetra;
import GeradorDeSenha.dominio.Numero.EntradaNumero;

public class Opcoes {
    int numLetra;
    int numCaracter;
    int numNumero;
    public void opcoes(int num1){
        switch (num1) {
            case 1:
                Opcao01 opcao01=new Opcao01();
                break;

            case 2:
                Opcao02 opcao02=new Opcao02();
                break;

            case 3:
                Opcao03 opcao03=new Opcao03();
                break;

            case 4:
                Opcao04 opcao04=new Opcao04();
                break;
        
            default:
                break;
        }
    }

    protected char[] letras(){
        Scanner scan=new Scanner(System.in);
        EntradaLetra letrasEntrada=new EntradaLetra();
        char[] charLetras;
        System.out.print("\nDigite a quantidade de Letras: (Máximo 26)\n>>");
        int numLetra=scan.nextInt();
        setNumLetra(numLetra);
        charLetras=letrasEntrada.entradaLetra(numLetra);
        return charLetras;
    }

    protected char[] numeros(){
        Scanner scan=new Scanner(System.in);
        EntradaNumero numerosEntrada=new EntradaNumero();
        char[] charNumeros;
        System.out.print("\nDigite a quantidade de Números: (Máximo 9)\n>>");
        int numNumeros=scan.nextInt();
        setNumNumero(numNumeros);
        charNumeros=numerosEntrada.entradaNumero(numNumeros);
        return charNumeros;
    }

    protected char[] caracteres(){
        Scanner scan=new Scanner(System.in);
        EntradaCaractere caractereEntrada=new EntradaCaractere();
        char[] charCaractres;
        System.out.print("\nDigite a quantidade de Caracteres: (Máximo 22)\n>>");
        int numCarac=scan.nextInt();
        setNumCaracter(numCarac);
        charCaractres=caractereEntrada.entrada(numCarac);
        return charCaractres;
    }

    public int getNumLetra() {
        return numLetra;
    }

    public void setNumLetra(int numLetra) {
        this.numLetra = numLetra;
    }

    public int getNumCaracter() {
        return numCaracter;
    }

    public void setNumCaracter(int numCaracter) {
        this.numCaracter = numCaracter;
    }

    public int getNumNumero() {
        return numNumero;
    }

    public void setNumNumero(int numNumero) {
        this.numNumero = numNumero;
    }
}


    
