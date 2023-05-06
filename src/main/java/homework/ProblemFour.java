package homework;

public class ProblemFour {
    public void greatestNum(int num1,int num2, int num3){
        int maxOne = Math.max(num1,num2);
        int maxTwo = Math.max(num3,maxOne);
        System.out.println("The greatest: " + maxTwo);
    }
}
