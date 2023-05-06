package homework;

public class ProblemThree {
    public void posOrNeg(){
        int numOne = 35;
        int numTwo = -35;
        if (numOne > 0 || numTwo < 0){
            System.out.println(numOne + " : the number is positive");
            System.out.println(numTwo + " : the number is negative");
        }
    }
    public void posOrNeg2(int num){
    if (num > 0){
        System.out.print("the number is positive");
    } else if(num < 0){
        System.out.print("\nthe number is negative");
    }
}
}
