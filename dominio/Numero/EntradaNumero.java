package GeradorDeSenha.dominio.Numero;

public class EntradaNumero extends SubstituicaoNumero{
    public char[] entradaNumero(int num){
        char[] retorno;
        retorno=substituicaoNumero(preenchimentoNumero(num));
        return retorno;
    }
}
