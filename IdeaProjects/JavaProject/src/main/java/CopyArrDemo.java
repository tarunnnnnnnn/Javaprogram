import java.util.Scanner;

public class CopyArrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        int sum=0;
      int n = 523;
      int temp=n;
      while(n>0){
        r=n%10;
        sum+=r*r*r;
        n=n/10;
      }
        if (temp == sum) {

            System.out.println("it is armstrong");
        }
        else{
            System.out.println("not");
        }



    }
}
