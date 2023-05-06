package practice;

public class SimpleMath {
        public void sumResult2() {
            int num1 = 10;
            int num2 = 2;
            int result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
        public static void main (String[] args){
            SimpleMath mathObj = new SimpleMath();
            mathObj.sumResult2();
        }
    }

