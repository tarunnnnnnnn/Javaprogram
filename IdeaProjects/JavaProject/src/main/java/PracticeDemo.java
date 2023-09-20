public class PracticeDemo {
    public static void main(String[] args) {
        int no = 5 ;
        for(int i =0;i<no;i++)
        {
            for(int j=1;j<=no;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i+i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
