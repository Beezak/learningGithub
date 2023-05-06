package practice;

public class SplitArray {
    public static void main(String[] args) {
        String names = "John,Ali,Mathew,Abraham";
        String[] nameArray = names.split(",");
        for(String person : nameArray){
            System.out.println("person name is : "+ person);
        }

        String sentence = "I live in Virginia";
        String[] words = sentence.split(" ");
        for( String word : words){
            System.out.println("the word is : "+ word);
        }

        String reverse = "";
        for(int i =words.length -1; i >=0; i--){
            reverse += words[i] + " ";
        }
        System.out.println("sentence is: "+ reverse);
    }
}
