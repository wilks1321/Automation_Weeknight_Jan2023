package Action_Items_Weeknights;

public class AI_02_ConditionalStatement {
    public static void main(String[] args) {
        //Declare integer variable for Grades
        int Grade = 59;
        //Condition Statements
        if (Grade >= 90 && Grade <= 100) {
            System.out.println("Grade is a A");
        } else if (Grade >= 80 && Grade <= 90) {
            System.out.println("Grade is a B");
        } else if (Grade >= 70 && Grade <= 80) {
            System.out.println("Grade is a C");
        } else if (Grade >=60 && Grade<=70) {
            System.out.println("Grade is D");
        } else if (Grade <= 60) {
            System.out.println("Grade is a F");
        }
    }//End of main
}//End of Java