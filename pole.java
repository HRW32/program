import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class pole {
    //1
    /* 
    public static void main(String[] args) {
    Random g = new Random();
    int x = rd.nextInt(100);
    int[] pole = new int[x];

    
    for (int i = 0; i < pole.length; i++){
        cislo = g.nextInt(100);
        System.out.println(pole[i]);
        
    }
    }
    */
    
/* 
   public static void main(String[] args) {
    //2 
    //Random rd = new Random();
    int[] pole = new int[10];
    //nevím k čemu jsou tento řádek
    pole [0] = 1;
    // musí to být oddělené
    String[]simpsonovi = {"Bart","Marge" , "Lisa", "Homer"};
    
    Arrays.sort(simpsonovi);
    int index = Arrays.binarySearch(simpsonovi, "Bart");
    System.out.println(Arrays.toString(simpsonovi));
    // ukazuje seřazení čísel v tabulce ASCII
    System.out.printf("%d %d \n",(int)'h', (int)'H');
    }
    }
*/
    



   /* 
    public static void main(String[] args) {
        //3
        // dáme kolik míst/šupliků nám to má uložit
        int[] myArray = new int [20];
        Random rd = new Random();
        int sudaCisla = 0;
        int lichaCisla = 0;

        for (int i = 0; i < myArray.length; i++){
            int x = rd.nextInt(1000) + 1;

            myArray[i] = x;
        if (x%2 == 0) {
                sudaCisla++;
            }
        else {
                lichaCisla++;
            }
        }
        System.out.println("sude " + sudaCisla);
        System.out.println("liche " + lichaCisla);

}
}
*/

/*
public static void main(String[] args) {
    //4
        Scanner sc = new Scanner(System.in);
        int[] pole = new int[5];       

        for (int i = 0; i < pole.length; i++){
        System.out.println("zadejte číslo");
        int number = Integer.parseInt(sc.nextLine());
        pole[i] = number;
        }

        for(int j = 0; j < pole.length; j++){
        System.out.print(pole[j] + " ");
        }
        System.out.println(" ");

        for(int k = 0; k < pole.length; k++){
        if(pole[k] >0){
           pole[k] *= -1;
        }
            System.out.print(pole[k] + " ");
        }
}*/



/*

public static void main(String[] args) {
    //5
    Random rd = new Random();
    int[] cisla = new int[20];  
    int pocetcisel = 0;

    for(int i = 0; i < cisla.length; i++){
        int random_cislo = rd.nextInt(5)+1;
        cisla[i] = random_cislo;
        System.out.print(cisla[i]);
    }
    
    for(int j = 0; j < cisla.length; j++){
        if(cisla[j] == cisla[19]){
        pocetcisel++;
    }
    }
    System.out.println("Číslo "+ cisla[19]+ " je vygenerováno dohromady "+ pocetcisel + "x");
}
}
*/

/* 
public static void main(String[] args) {
    //6
    int size = 300;
    int[] cislo = new int[size];
    for(int i = 0; i < size; i++){
    // proc tu je cislo[i]?
        cislo[i] = new Random().nextInt(20) + 1;
    }
    for(int i = 0; i < size; i++){
        if(cislo[i] == 15);{
            System.out.println("první 15 je na indexu " + i);
            // co znamená return?
            return;
        }
}
System.out.println("V poli se nenachází 15");
}
}
*/

public static void main(String[] args) {
    //7
    // vygeneruje se 20 čísel. rozměr je od 0 do 5. Vygenerují se čísla a to poslední číslo spočítáme kolikrát bylo mezi těmi 20 čísly 
        final int rozmer = 20;
        Random rd = new Random();
        int [] suplik = new int[rozmer];
        int posledni = 0;
        int pocetvyskytu = 0;

        for(int i = 0; i < rozmer; i++){
            int pocet = rd.nextInt(6);
            System.out.println(pocet);
            suplik[i] = pocet;
        }
        for(int i = 0; i < rozmer; i++){
            if(suplik[rozmer - 1] == suplik[i]){
                pocetvyskytu++;
            }

        }
        System.out.printf("pocet vyskytu posledniho cisla: %d je: %d \n", suplik[rozmer - 1], pocetvyskytu);
}
}
