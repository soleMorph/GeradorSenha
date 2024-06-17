package GeradorDeSenha.dominio.Caracter;

public class EntradaCaractere extends SubstituicaoCaractere{
    public char[] entrada(int num){
        char[] retorno;
        retorno=substituicaoCaracter(preenchimentoCaracter(num));
        return retorno;
    } 
}
