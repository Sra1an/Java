// import java.lang.ProcessBuilder;
// import java.io.IOException;
import java.util.Scanner;

public class program2 {
    // public static void ClearConsole(){
    //     ProcessBuilder pb = new ProcessBuilder("cls");
    //     Process startProcess = pb.inheritIO.start();
    //     startProcess.waitFor();
    //  }
    public static void main(String[] args) {
        // ClearConsole(); not working
        System.out.print("\033[H\033[2J");
        System.out.flush(); // clear prev output

        System.out.println("Hello World\n");
        // Output

        for(int i=1; i<=4; i++) {
            for(int j=0; j<i; j++) System.out.print(" *");
            System.out.println();
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String st = sc.nextLine();
        System.out.println("Hello "+ st);
        System.out.println("Enter two num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
        sc.close();
    }
}
