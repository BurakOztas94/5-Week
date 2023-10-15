import java.util.Scanner;

public class Main {
    public static void main (String[] args)
        {

            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter a number that returns given array's index number : ");
            int n = scan.nextInt ();
            try{
                int[] list={0 , 1 , 2 , 3 ,4 , 5,  7, 3 ,5 ,7 };
                System.out.println (list[n]);

            }catch (ArrayIndexOutOfBoundsException  e){
                System.out.println (e.getMessage ());
            }

            scan.close ();
        }
}
