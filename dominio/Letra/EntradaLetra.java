package GeradorDeSenha.dominio.Letra;

public class EntradaLetra extends SubstituicaoLetra{

    public char[] entradaLetra(int num){
        char[] retorno;
        retorno=substituicaoLetra(preenchimentoLetra(num));
        return retorno;
    }
}
