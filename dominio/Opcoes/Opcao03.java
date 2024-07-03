package GeradorDeSenha.dominio.Opcoes;

import GeradorDeSenha.dominio.JuncaoChars.JuncaoOpcoes;

public class Opcao03 extends Opcoes{

    private char[] letraMain;
    private char[] caracterMain;
    private char[] juncaoChar;

    Opcao03(){
        letra_carac();
    }

    public void letra_carac(){
        setLetraMain(letras());
        setCaracterMain(caracteres());
        /*for (char c : getLetraMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");
        for (char c : getCaracterMain()) {
            System.out.print(c+", ");
        }
        System.out.println("");*/
        juncaoOpc03();
    }


    private void juncaoOpc03(){
        int numJuncao=getNumLetra()+getNumCaracter();
        char[] juncao2=new char[numJuncao];
        char[] caracteres=getCaracterMain();
        char[] letras=getLetraMain();
        for(int i=0;i<getNumCaracter();i++){
            juncao2[i]=caracteres[i];
        }
        int e=getNumCaracter();
        for(int i=0;i<getNumLetra();i++){
            juncao2[e]=letras[i];
            if (e<numJuncao) {
                e++;
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

    public char[] getLetraMain() {
        return letraMain;
    }
    private void setLetraMain(char[] letraMain) {
        this.letraMain = letraMain;
    }
    public char[] getCaracterMain() {
        return caracterMain;
    }
    private void setCaracterMain(char[] caracterMain) {
        this.caracterMain = caracterMain;
    }
    public char[] getJuncaoChar() {
        return juncaoChar;
    }
    public void setJuncaoChar(char[] juncaoChar) {
        this.juncaoChar = juncaoChar;
    }
}
