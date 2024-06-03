package GeradorDeSenha.dominio;

import java.util.Random;
import java.util.Scanner;

public class SomenteNumero {

    protected void somenteNumero(){
        Random aleatorio=new Random();
        
    }
    private int quantidadeDeNumeros(){
        Random aleatorio=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.print("Digite quantos numeros irá querer: ");
        int quantidadeNumero=scan.nextInt();
        System.out.print("\nDigite quantas carácteres irá querer: ");
        int quantidadeCaracter=scan.nextInt();
        aleatorio.nextInt(0, quantidadeNumero);
        for(int i=0; i<quantidadeNumero;i++){
            
        }
        for(int i=0; i<quantidadeCaracter; i++){

        }
        return 0;
    }
}
