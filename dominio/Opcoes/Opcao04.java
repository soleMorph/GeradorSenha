package GeradorDeSenha.dominio.Opcoes;


public class Opcao04 extends Opcoes{
    Opcao04(){
        letra_carac_num();
    }
    public void letra_carac_num(){
        char[] numeross;
        char[] letrass;
        char[] caracter;
        char[] fin;
        numeross=numeros();
        letrass=letras();
        caracter=caracteres();
        fin=letrass;
        for(int i=0;i<numeross.length;i++){
            System.out.print(numeross[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<letrass.length;i++){
            System.out.print(letrass[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<caracter.length;i++){
            System.out.print(caracter[i]+", ");
        }
    }
}
