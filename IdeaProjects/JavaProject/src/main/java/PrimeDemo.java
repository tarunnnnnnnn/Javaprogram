import java.util.Scanner;

public class PrimeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        boolean prime =true;


        for(int i =2;i<=s/2;i++){
            if(i%s==0)
                System.out.println("is not a prime number");
            prime= false;

            }
        if(prime)
            System.out.println("is a prime number");
        }




    }

