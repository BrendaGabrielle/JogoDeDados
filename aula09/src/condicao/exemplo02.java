// Exemplo 2
package condicao;

public class exemplo02 {
    public static void main(String[] args) {
        String esporte = "polo";
        switch (esporte){
            case "voley":
            case "Futbol":
            case "basket":
               System.out.println("Esporte de Quadra");
                break;
            case "Natação":
            case "nado Sicro..":
            case "polo":
             System.out.println("esp AQ");
                break;
            default:
                    System.out.println("Vc nao escolheu nenhum esporte");
                
        }
    }
}
