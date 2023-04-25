package Day3_03132023;

import java.util.ArrayList;

public class T1_WhileLoop {
    public static void main(String[] args) {

        //Create an Array list of Cities
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Staten Island");

        //Set the initial point
        int i = 0;
        while (i < cities.size()) {
            System.out.println("Cities: " + cities.get(i));
            i = i + 1; //incrementation

        }//End of Loop

    }//End of main
}//End of class
