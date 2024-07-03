package GeradorDeSenha.dominio.Opcoes;

import GeradorDeSenha.dominio.JuncaoChars.JuncaoOpcoes;

public class Opcao01 extends Opcoes{
    //numeros e caractere

    private char[] caracterMain;
    private char[] numeroMain;
    private char[] juncaoChar;

    protected Opcao01(){
        num_caractere();
    }

    public void num_caractere(){
        setNumeroMain(numeros());
        setCaracterMain(caracteres());
        /*for (char n : getNumeroMain()) {
            System.out.print(n+", ");
        }
        System.out.println("");
        for (char c : getCaracterMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");*/
        juncaoOpc01();
    }

    private void juncaoOpc01(){
        int numJuncao=getNumCaracter()+getNumNumero();
        char[] juncao2=new char[numJuncao];
        char[] numeros=getNumeroMain();
        char[] caracteres=getCaracterMain();
        for(int i=0;i<getNumNumero();i++){
            juncao2[i]=numeros[i];
        }
        int e=getNumNumero();
        for(int i=0;i<getNumCaracter();i++){
            juncao2[e]=caracteres[i];
            if (e<numJuncao) {
                e++;
            }
        }
        juncaoChar=juncao2;
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

    public char[] getCaracterMain() {
        return caracterMain;
    }

    public void setCaracterMain(char[] caracterMain) {
        this.caracterMain = caracterMain;
    }

    public char[] getNumeroMain() {
        return numeroMain;
    }

    public void setNumeroMain(char[] numeroMain) {
        this.numeroMain = numeroMain;
    }

    private char[] getJuncaoChar() {
        return juncaoChar;
    }

    private void setJuncaoChar(char[] juncaoChar) {
        this.juncaoChar = juncaoChar;
    }
}
