import java.util.Random;
import java.util.Scanner;

public class clovece_nezlob_se {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("napiš počet polí");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Start: :(");
        for (int i = 0; i < n - 1; i++){
            System.out.print("O ");
        }System.out.println("");
        
        System.out.println("Start: :)");
        for (int i = 0; i < n - 1; i++){
        System.out.print("O ");
        }
        System.out.println("");
        System.out.println("");
        
        int predx = 0;
        int zax = n - 1;

        int predy = 0;
        int zay = n - 1;

        Random g = new Random();
        int pocet = 1;
        int hod = 1;
        
        while (zax > 0 && zay > 0){
            hod = g.nextInt (6) + 1;
            if ((zax - hod) >= 0){
                predx += hod;
                zax -= hod;
            }
        }
        System.out.print(pocet + ". hod - padla "+ hod + ": ");
        pocet++;
        for (int i = 0; i < predx; i++){
            System.out.print("O ");
        }
        System.out.print(":) ");

        for (int i = 0; i < zax; i++){
            System.out.print("O ");
        }
       System.out.println("");
            
       while (zax > 0 && zay > 0){
            hod = g.nextInt (6) + 1;
            if ((zax - hod) >= 0){
                predx += hod;
                zax -= hod;
            }
        
        System.out.print(pocet + ". hod - padla "+ hod + ": ");
        pocet++;
        for (int i = 0; i < predx; i++){
            System.out.print("O ");
        }
        System.out.print(":) ");

        for (int i = 0; i < zax; i++){
            System.out.print("O ");

        }
       
    }
           
        
       System.out.println("");
       
       if (zax > 0){
        System.out.println("vyhral :)");
       }
       else if (zay > 0){
        System.out.println("vyhral :(");
       }
       else{
        System.out.println("remiza");
       }

}
}
