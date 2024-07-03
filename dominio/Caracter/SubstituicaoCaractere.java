package GeradorDeSenha.dominio.Caracter;

public class SubstituicaoCaractere extends PreenchimentoCaractere{
    
    protected static char[] substituicaoCaracter(char[] senha){
        for(int i=0;i<senha.length;i++){
            for(int e=0;e<senha.length;e++){
                if (senha[i]==senha[e] && i!=e) {
                    senha[e]=geradorCaracter();
                    substituicaoCaracter(senha);
                }            
            }
        }
        return senha;
    }
}
