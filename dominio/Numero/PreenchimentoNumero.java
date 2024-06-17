package GeradorDeSenha.dominio.Numero;

public class PreenchimentoNumero extends GeradorNumero{
    protected char[] preenchimentoNumero(int numero){
        char[] arrayNumero=new char[numero];
        for(int i=0;i<arrayNumero.length;i++){
            arrayNumero[i]=geradorNumero();
        }
        return arrayNumero;
    }
}
