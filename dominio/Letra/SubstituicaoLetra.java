package GeradorDeSenha.dominio.Letra;

public class SubstituicaoLetra extends PreenchimentoLetra{

    protected static char[] substituicaoLetra(char[] senha){    //codigo para fazer a substituição das palavras iguais
        for(int i=0;i<senha.length;i++){
            for(int e=0;e<senha.length;e++){
                if (senha[i]==senha[e] && i!=e) {
                    senha[e]=geradorMinuscula();
                    substituicaoLetra(senha);
                }            
            }
        }
        return senha;
    }
}
