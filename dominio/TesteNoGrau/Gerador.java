package GeradorDeSenha.dominio.TesteNoGrau;

import java.util.Scanner;

import GeradorDeSenha.dominio.Opcoes.Opcoes;

//import BoasVindas.Project01;

public class Gerador /*extends Project01*/{

    public void geradorInicio(){
        Scanner scan=new Scanner(System.in);
        //inicio();
        System.out.println("\nBem-Vindo ao gerador senha");
        System.out.print("Digite seu nome: ");
        String nome=scan.nextLine();
        escolha(nome);
    }
    private void escolha(String nome){
        Scanner scan=new Scanner(System.in);
        Opcoes opcoes=new Opcoes();
        System.out.print(nome+" você deseja uma combinação de \n(1) combinação de números e carácteres\n(2) combinação de números e letras\n(3) combinação de letras e carácteres\n(4) combinação de números, letras e caracteres\n>>");
        int resposta=scan.nextInt();
        System.out.println("");
        switch (resposta) {
            case 1:
                System.out.println("foi escolhida a opçao \"combinação de números e caracteres\"");
                opcoes.opcoes(1);
                break;
            case 2:
                System.out.println("foi escolhido a opção \"combinação de números e letras\"");
                opcoes.opcoes(2);
                break;
            case 3:
                System.out.println("foi escolhida a opçao \"combinação de letras e caracteres\"");
                opcoes.opcoes(3);
                break;
            case 4:
                System.out.println("foi escolhida a opçao \"combinação de números, letras e caracteres\"");
                opcoes.opcoes(4);
                break;
            default:
                System.out.println("Opção inválida\nDigite novamente...");
                escolha(nome);
                break;
        }
    }

}
