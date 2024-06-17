package GeradorDeSenha.dominio.Letra;

public class PreenchimentoLetra extends GeradorMinuscula{
    protected char[] preenchimentoLetra(int numero){    //método para retorno do array
        char[] senha=new char[numero];
        for(int i=0;i<senha.length;i++){
            senha[i]=geradorMinuscula();
        }
        return senha;
    }
}
