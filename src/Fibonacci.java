import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]) {

        System.out.println("Enter number till Fibonacci series is required: ");

        int firstTerm = 0, secondTerm = 1;

        Scanner fb = new Scanner(System.in);
        int n = fb.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms is: ");



        for(int i = 1; i <= n; i++){

            System.out.print(firstTerm + ", ");

            //compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}


//Fibonacci number at exact index required.

// import java.util.Scanner;
// public class Fibonacci {
//     public static void main(String args[]) {
//     System.out.println("Enter the index of which Fibonacci number is required: ");
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int a = 0;
//         int b = 1;
//         int count = 2;
        
//         while (count <= n) {
                                      // Enter Print statement here if u want to see all the previous no.s  System.out.print(b + " ");
//             int temp = b;          // Replace 'b' with 'a' in print statement if you want to print '0' in the series.
//             b = b + a;
//             a = temp;
//             count++;
//         }    
        
//         System.out.println(b + " ");
        
//     }  
// }  
