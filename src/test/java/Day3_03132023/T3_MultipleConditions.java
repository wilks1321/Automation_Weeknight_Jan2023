package Day3_03132023;

public class T3_MultipleConditions {
    public static void main(String[] args) {
        //Declare three integer variables
        int A = 1;
        int B = 4;
        int C = 6;
        //Print out conditions when A+B either greater, equal or less than C
        if(A+B > C) {
            System.out.println("A & B is greater than C");
        } else if(A+B == C){
            System.out.println("A & B is equal to C");
        } else {
            System.out.println("A & B is less than C");
        }//End of multiple conditions
    }//End of Main
}//End of Class
