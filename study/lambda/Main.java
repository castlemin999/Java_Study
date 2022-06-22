package study.lambda;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*
        * Lambda Expressions
        * 식별자 없이 실행가능한 함수
        * (매개변수, ...) -> { 실행문 ... }
        * */
        
        // 기존의 익명 함수
        /*System.out.println(new LambdaFunction(){
            public int sum(int a, int b){
                return a + b;
            }
        }.sum(3, 5));*/
        
        // 람다식을 이용한 익명함수
        LambdaFunction lambdaFunction = (int a, int b) ->  a + b;
        // LambdaFunction lambdaFunction = Integer::sum;
        System.out.println(lambdaFunction.sum(2,3));


        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());
    }

    @FunctionalInterface
    interface LambdaFunction{
        int sum(int a, int b);
    }






}
