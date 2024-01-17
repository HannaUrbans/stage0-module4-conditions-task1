package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public static void isPositive(int numberToBeDetermined) {
        if(numberToBeDetermined>0){
            System.out.println("true");
        }
        else{System.out.println("false");}}

    public static void main (String [] args){
        int numberToBeDetermined=5;
        isPositive (numberToBeDetermined);
    }

}

//Create a program that will determine and print
// if consumed number is positive (in this case print true) or
// no (print false) using if-else block.