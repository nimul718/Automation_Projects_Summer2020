package Day3_09062020;

public class Action_Item {

    public static void main(String[] args) {

        int grade = 38;
        //if grade is 90 to 100 then grade is A
        if(grade >=90 && grade <=100) {
            System.out.println("the Grade is A");

        } else if (grade >=80 && grade <90) {
            System.out.println("the Grade is B");
        } else if (grade >=70 && grade <80) {
            System.out.println("the Grade is C");
        } else if (grade >=60 && grade <70) {
            System.out.println("the Grade is D");
        } else if (grade <60) {
            System.out.println("the Grade is F");
        }



    }//end of main method

}//end of java class

