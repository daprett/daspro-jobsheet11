import java.util.Scanner;

public class nestedLoop21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [][]temps = new double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City :"+ (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day "+ (j+1)+":");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City :" + (i+1) );
            double totaltemp=0;
            for (int j = 0; j < temps[i].length; j++) {
                totaltemp += temps[i][j];
                
            }
            
            double rata = totaltemp / temps[0].length;
            System.out.println(" rata-rata temperatur kota : "+rata);
        }

        // for (int i = 0; i < temps.length; i++) {
        //     System.out.println("City : "+(i+1));
        //     for (double temp : temps[i]) {
        //         System.out.print(temp + " ");
        //     }
        //    System.out.println();
        // }
    }
}
