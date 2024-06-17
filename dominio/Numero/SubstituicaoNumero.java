package GeradorDeSenha.dominio.Numero;

public class SubstituicaoNumero extends PreenchimentoNumero{
    protected char[] substituicaoNumero(char[] senha){
        for(int i=0;i<senha.length;i++){
            for(int e=0;e<senha.length;e++){
                if (senha[i]==senha[e] && i!=e) {
                    senha[e]=geradorNumero();
                    substituicaoNumero(senha);
                }            
            }
        }
        return senha;
    }
}
