package GeradorDeSenha.dominio.JuncaoChars;

import java.util.Random;

public class JuncaoOpcoes {

    private String stringMain;
    private int tamanhoMain;
    private char[] charFinal;
    private char[] tratamento;

    public char[] principalBot(char[] qualquer){
        transformaString(qualquer);
        substituicao(preenchimentoJuncao(randomCharJuncao()));
        char[] fodase=getCharFinal();
        return fodase;
    }

    private void transformaString(char[] osChars){
        String stringChars="";
        int tamanho=0;
        for(int i=0;i<osChars.length;i++){
            stringChars+=osChars[i];
            tamanho+=1;
        }
        setTamanhoMain(tamanho);
        setStringMain(stringChars);   
    }

    private char randomCharJuncao(){
        Random random = new Random();
        String setOfCharacters = getStringMain();
        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        return randomChar;
    }

    private char[] preenchimentoJuncao(char randomChar){
        char[] aux=new char[getTamanhoMain()];
        for(int i=0;i<getTamanhoMain();i++){
            aux[i]=randomChar;
        }
        setTratamento(aux);
        return getTratamento();
    }

    private void  substituicao(char[] preenchido){
        for(int i=0;i<preenchido.length;i++){
            for(int e=0;e<preenchido.length;e++){
                if (preenchido[i]==preenchido[e] && i!=e) {
                    preenchido[e]=randomCharJuncao();
                    substituicao(getTratamento());
                }            
            }
        }
        setCharFinal(preenchido);
    }

    private String getStringMain() {
        return stringMain;
    }

    private void setStringMain(String stringMain) {
        this.stringMain = stringMain;
    }

    private int getTamanhoMain() {
        return tamanhoMain;
    }

    private void setTamanhoMain(int tamanhoMain) {
        this.tamanhoMain = tamanhoMain;
    }

    private char[] getCharFinal() {
        return charFinal;
    }

    private void setCharFinal(char[] charFinal) {
        this.charFinal = charFinal;
    }

    public char[] getTratamento() {
        return tratamento;
    }

    public void setTratamento(char[] tratamento) {
        this.tratamento = tratamento;
    }
}
