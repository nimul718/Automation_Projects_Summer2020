package Day3_09062020;

public class Action_Item2 {
    public static void main(String[] args) {

        String[] Cities = new String[4];
        Cities[0] = "Brooklyn";
        Cities[1] = "Manhattan";
        Cities[2] = "Queens";
        Cities[3] = "Bronx";

        for(int i = 0; i < Cities.length; i++){
            //print only when Cities is Manhattan or  Brooklyn
            if(Cities[i] == "Manhattan"){
                System.out.println("My city is " + Cities[i]);
            }
            if(Cities[i] == "Brooklyn"){
                System.out.println("My city is " + Cities[i]);
            }
        }//end of for loop


    }//end of main method


}//end of java class
