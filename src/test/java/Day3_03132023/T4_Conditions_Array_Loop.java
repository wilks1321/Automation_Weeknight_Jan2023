package Day3_03132023;

public class T4_Conditions_Array_Loop {
    public static void main(String[] args) {

        //Create a list of Fruits
        String[] Fruits = new String[]{"Orange", "Grape", "Mango", "Strawberry"};

        //Iterate through the list of fruit but only print when fruit is either Orange or Grape
        for (int i = 0; i < Fruits.length; i++) {

                /*
            if (Fruits[i] == "Orange" || Fruits[i] == "Grape") {
                System.out.println("Fruit is " + Fruits[i]);
                }// End of Conditions
                */

            if (Fruits[i] == "Orange") {

                //Print when its Orange or Grape
                if (Fruits[i] == "Orange") {
                    System.out.println("Fruit is Orange");
                } else if (Fruits[i] == "Grape") ;
            }
        }//End of Condition
    }//End of Main
}//End of class
