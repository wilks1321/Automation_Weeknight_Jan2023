package Practice;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        //Create an arrayList of four games and what year it came out
        ArrayList<String> Games = new ArrayList<>();
        Games.add("Super Mario");
        Games.add("Call of duty");
        Games.add("NBA");
        Games.add("MLB");
        // Call the Integer of the year it came out
        ArrayList<Integer> Year = new ArrayList<>();
        Year.add(1991);
        Year.add(2001);
        Year.add(2005);
        Year.add(2010);
        for (int i = 0; i < Games.size(); i++) {
            System.out.println("The video game is called " + Games.get(i) + " the year it came out was " + Year.get(i));
        }// end of loop
    }//end of main
}//end of loop
