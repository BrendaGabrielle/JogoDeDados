
package condicao;

public class pares {
    public static void main(String[] args) {
        String texto ="";
        for (int i=0; i<=40; i++){
            if (i % 2 == 0){
            texto += i+ "/";
            }
        } 
         System.out.println(texto);
    }
    
}
