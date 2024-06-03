package GeradorDeSenha.dominio;

import java.util.Scanner;

import BoasVindas.Project01;

public class Gerador extends Project01{

    public void geradorInicio(){
        Scanner scan=new Scanner(System.in);
        inicio();
        System.out.println("\nBem-Vindo ao gerador senha");
        System.out.print("Digite seu nome: ");
        String nome=scan.nextLine();
        escolha(nome);
    }
    protected void escolha(String nome){
        Scanner scan=new Scanner(System.in);
        System.out.println(nome+" você deseja uma combinação de \n(1) combinação de números e carácteres\n(2) combinação de números, letras e carácteres\n(3) combinação de letras e carácteres");
        int resposta=scan.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("foi escolhida a opçao \"combinação de números e carácteres\"");
                break;
            case 2:
            System.out.println("foi escolhida a opçao \"combinação de números, letras e carácteres\"");
                break;
            case 3:
            System.out.println("foi escolhida a opçao \"combinação de letras e carácteres\"");
                break;
            default:
            System.out.println("Opção inválida\nDigite novamente...");
            escolha(nome);
                break;
        }
    }

}
