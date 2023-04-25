package Action_Items_Weeknights;

import java.util.ArrayList;

public class ForLoop_LinearArray {
    public static void main(String[] args) {
        String[] Region;
        //Regions selected
        Region = new String[]{"Bogota", "Rome", "Paris", "London"};
        //Area code for region
        int[] AreaCode = new int[]{6012, 06, 144, 20};
        for (int i = 0; i < Region.length; i++){
        System.out.println("My region is " + Region[i] + " and my area code is " + AreaCode[i]);

        }
    }//End of main
}//End of loop
