import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunApp {

    public static void run(){
        Scanner scan=new Scanner (System.in);
        System.out.print ("Please enter text : ");
        String line= scan.nextLine ();                          // input line
        String[] text = line.split ("\\s+");              // this line splits input line
        HashMap<String,Integer> wordCounter=new HashMap<> ();   //This is for storing key and values for words

        for( String entry : text){                              //this for each look every split  word and counts
            if(wordCounter.containsKey (entry)){
                wordCounter.put (entry,wordCounter.get (entry)+1);       //word, counter. get (entry)+1 is
                                                                         // you can see how is counting below sout line
                                                                         //   System.out.println (entry+" : " + wordCounter.get (entry) );
            }
            else {
                wordCounter.put (entry,1);                              // this writes first

            }
        }
        String result =wordCounter.entrySet ().stream ().max((entry1, entry2)
                -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();          //this line is comparison line for each word amount

        System.out.println ("'"+ result +"'" + " amount : "+wordCounter.get (result));
    }
}
