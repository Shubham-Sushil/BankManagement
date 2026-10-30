package org.nextbyte.revision.exception;

public class Calculator {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int result1 = cal.divide(10,2);
        System.out.println(result1);

        int result2 = cal.divide(10,0);
        System.out.println(result2);
    }


    public int divide(int x, int y){
        int result = -2222222;
        try {
            result = x / y;
        }catch (Exception e){
            System.out.println("Can't divide by zero");
        }finally {
            return result;
        }

    }

}
