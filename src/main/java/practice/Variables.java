package practice;

public class Variables {
    public void intVariables(){
        int salary = 1000;
        System.out.println("My salary is: "+ salary);
    }
        public void floatVariables(){
        float price = 45.6f;
        System.out.println("Product price is: "+ price);
    }

    public void booleanVariables(){
        boolean red = true;
        boolean green = false;// this is a comment
        System.out.println("Red light is: "+ red + "\nGreen light is: "+ green);
    }
    public void characterVariables(){
        char alphabet = 'A';
        System.out.println("The alphabet letter is : "+ alphabet);
    }
    public void stringVariable(){
        String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is : "+ name +" I live in: " +city);
    }
    public void sumResult() {
        int num1 = 10;
        int num2 = 2;
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
