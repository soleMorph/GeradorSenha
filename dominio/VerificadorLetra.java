package GeradorDeSenha.dominio;

public class VerificadorLetra {

    public static void verificadorLetra(int numero){    //codigo para fazer a substituição das palavras iguais
        char[] senha=new char[numero];
        GeradorMinuscula gerador=new GeradorMinuscula();
        String resultadoMinuscula="";
        boolean parada=false; //variável de parada das condicionais
        for(int i=0;i<senha.length;i++){
            senha[i]=gerador.geradorMinuscula();
            System.out.print(senha[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<senha.length;i++){
            for(int e=0;e<senha.length;e++){
                if (i==e) { //verificação de igualdade indices
                    if (e==senha.length-1) {
                        for(int r=0;r<senha.length;r++){
                            System.out.print(senha[r]+", ");
                        }
                        parada=true;
                        System.out.println("acabou");
                    }else{
                        e+=1;
                    }
                    if (e<senha.length && parada==false) {
                        if (senha[i]==senha[e]) {
                            senha[e]=gerador.geradorMinuscula(); 
                            System.out.println(senha[e]+" --");
                        }else{
                            //System.out.print(senha[i]+" é diferente de "+senha[e]);
                            //System.out.println("");
                            //System.out.println(i+" "+e);
                        }
                    }
                }

                if (senha[i]==senha[e] && parada==false) {
                    senha[e]=gerador.geradorMinuscula();
                    System.out.println(senha[e]+" ---");
                }else{
                    //System.out.print(senha[i]+" é diferente de "+senha[e]);
                    //System.out.println("");
                }
            }
        }
    }
}
