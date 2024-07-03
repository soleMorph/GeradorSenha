package GeradorDeSenha.dominio.Opcoes;

import GeradorDeSenha.dominio.JuncaoChars.JuncaoOpcoes;

public class Opcao04 extends Opcoes{

    private char[] letrasMain;
    private char[] caracterMain;
    private char[] numerosMain;
    private char[] juncaoChar;

    Opcao04(){
        letra_carac_num();
    }

    public void letra_carac_num(){
        setLetrasMain(letras());
        setCaracterMain(caracteres());
        setNumerosMain(numeros());
        /*for (char c : getLetrasMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");
        for (char c : getCaracterMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");
        for (char c : getNumerosMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");*/
        juncaoOpc04();
    }

    private void juncaoOpc04(){
        int numJuncao=getNumLetra()+getNumCaracter()+getNumNumero();
        char[] juncao2=new char[numJuncao];
        char[] letras=getLetrasMain();
        char[] caracteres=getCaracterMain();
        char[] numeros=getNumerosMain();

        for(int i=0;i<getNumLetra();i++){
            juncao2[i]=letras[i];
        }
        int e=getNumLetra();
        for(int i=0;i<getNumCaracter();i++){
            juncao2[e]=caracteres[i]; 
            if (e<numJuncao) {
                e++;
            }
        }
        int a=getNumLetra()+getNumCaracter();
        for(int i=0;i<getNumNumero();i++){
            juncao2[a]=numeros[i];
            if (a<numJuncao) {
                a++;
            }
        }
        /*for(int i=0;i<numJuncao;i++){
            System.out.print(juncao2[i]+", ");
        }*/
        setJuncaoChar(juncao2);
        JuncaoOpcoes juncaoOpcoes=new JuncaoOpcoes();
        char[] aux=juncaoOpcoes.principalBot(juncaoChar);
        System.out.println("");
        for(int i=0;i<aux.length;i++){
            System.out.print(aux[i]);
        }
    }

    private char[] getLetrasMain() {
        return letrasMain;
    }
    private void setLetrasMain(char[] letrasMain) {
        this.letrasMain = letrasMain;
    }
    private char[] getCaracterMain() {
        return caracterMain;
    }
    private void setCaracterMain(char[] caracterMain) {
        this.caracterMain = caracterMain;
    }
    private char[] getNumerosMain() {
        return numerosMain;
    }
    private void setNumerosMain(char[] numerosMain) {
        this.numerosMain = numerosMain;
    }
    private char[] getJuncaoChar() {
        return juncaoChar;
    }
    private void setJuncaoChar(char[] juncaoCharr) {
        this.juncaoChar = juncaoCharr;
    }
    
}
