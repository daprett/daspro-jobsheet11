import java.util.Random;
import java.util.Scanner;

public class Quiz21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu ='y';
        do {
            int number = rand.nextInt(10)+ 1;
            boolean success = true ;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                if (number > answer){
                    System.out.println("Lebih besar");
                } else if (number==answer){
                    System.out.println("Jawaban anda benar");
                } else {
                    System.out.println("Lebih kecil");
                }
                input.nextLine();
                success = (answer==number); 
                         
              } while (!success);
              System.out.print("Apakah anda ingin mengulang permainan(Y/T)");
              menu = input.next().charAt(0);
              input.nextLine();
              
        } while (menu == 'y' || menu == 'Y');
    }
}
