public class Condicional {
    public static void main(String[] args){
        //IF
        //IF .. ELSE
        //?
        //SWITCH

        int nota = 70;
        int media = 60;
        int faltas=100;
        int maxFaltas = 25;

        if(nota>media && faltas <= maxFaltas){
            System.out.println("Aprovado");
        }
        else if(nota>=40 || faltas > maxFaltas){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
        System.out.println("FIM");


        //ou operação ternaria - Condição ternaria
        String res;
        res=(nota >= media ? "Aprovado" : "Reprovado"); 
        System.out.println(res);

    }

    
}
