package Action_Items_Weeknights;

import java.util.ArrayList;

public class ForLoop_ArrayList {
    public static void main(String[] args) {
        ArrayList<String>  Country  = new ArrayList<>();
        //List of Countries
        Country.add("Colombia");
        Country.add("Italy");
        Country.add("France");
        Country.add("England");
        //List of Country codes
        ArrayList<Integer> CountryCode = new ArrayList<>();
        CountryCode.add(57);
        CountryCode.add(39);
        CountryCode.add(33);
        CountryCode.add(44);

        for (int i = 0; i < Country.size(); i++){
            System.out.println("My country is " + Country.get(i) + " and my country code is " + CountryCode.get(i));
        }
    }//End of main
}//End of Loop
