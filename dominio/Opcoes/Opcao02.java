package GeradorDeSenha.dominio.Opcoes;

import GeradorDeSenha.dominio.JuncaoChars.JuncaoOpcoes;

// import java.util.Scanner;
// import org.apache.commons.lang3.ArrayUtils;

//combinação de números e letras
public class Opcao02 extends Opcoes{

    private char[] numerosMain;
    private char[] letrasMain;
    private char[] juncaoChar;

    Opcao02(){
        letra_numero();
    }
    public void letra_numero(){
        setNumerosMain(numeros());
        setLetrasMain(letras());
        /*for (char c : getNumerosMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");
        for (char c : getLetrasMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");*/
        juncaoOpc02();
    }

    private void juncaoOpc02(){
        int numJuncao=getNumLetra()+getNumNumero();
        char[] juncao2=new char[numJuncao];
        char[] numeros=getNumerosMain();
        char[] letras=getLetrasMain();
        for(int i=0;i<getNumNumero();i++){
            juncao2[i]=numeros[i];
        }
        int e=getNumNumero();
        for(int i=0;i<getNumLetra();i++){
            juncao2[e]=letras[i];
            if (e<numJuncao) {
                e++;
            }
        }
        setJuncaoChar(juncao2);
        /*for(int i=0;i<numJuncao;i++){
            System.out.print(juncao2[i]+", ");
        }*/
        JuncaoOpcoes juncaoOpcoes=new JuncaoOpcoes();
        char[] aux=juncaoOpcoes.principalBot(juncaoChar);
        System.out.println("");
        for(int i=0;i<aux.length;i++){
            System.out.print(aux[i]);
        }

    }
    public char[] getNumerosMain() {
        return numerosMain;
    }
    private void setNumerosMain(char[] numerosMain) {
        this.numerosMain = numerosMain;
    }
    public char[] getLetrasMain() {
        return letrasMain;
    }
    private void setLetrasMain(char[] letrasMain) {
        this.letrasMain = letrasMain;
    }
    private char[] getJuncaoChar() {
        return juncaoChar;
    }
    private void setJuncaoChar(char[] juncaoChar) {
        this.juncaoChar = juncaoChar;
    }
}
