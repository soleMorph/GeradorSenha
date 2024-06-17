package GeradorDeSenha.dominio.Caracter;

public class PreenchimentoCaractere extends GeradorCaractere{
    protected static char[] preenchimentoCaracter(int numero) {
        char[] agrupamento=new char[numero];
        for(int i=0;i<agrupamento.length;i++){
            agrupamento[i]=geradorCaracter();
        }
        return agrupamento;
    }
}
