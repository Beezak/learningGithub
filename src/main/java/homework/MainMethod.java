package homework;

public class MainMethod {

    public static void main(String[] args){
        ProblemOne mathObj = new ProblemOne();
        mathObj.Math(125,24);
        ProblemTwo reverseObj = new ProblemTwo();
        reverseObj.stringReverse();
        ProblemThree posNegObj = new ProblemThree();
        posNegObj.posOrNeg();
        ProblemThree posNeg = new ProblemThree();
        posNeg.posOrNeg2(35);
        posNeg.posOrNeg2(-35);
        ProblemFour maxObj = new ProblemFour();
        maxObj.greatestNum(25,78,87);
    }
}
