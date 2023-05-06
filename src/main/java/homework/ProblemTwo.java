package homework;

public class ProblemTwo {

    public void stringReverse(){
        String originalString = "The quick brown fox";
        StringBuilder reverseString = new StringBuilder(originalString);
        String reversStr = reverseString.reverse().toString();
        System.out.println(reversStr);
    }
}
