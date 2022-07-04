package study.exception;

public class Main {
    public static void main(String[] args) {
        method1();
        try{
            method2();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("예외 처리 떠넘기기");
    }
    // 예외처리 직접 처리
    public static void method1(){
        try{
            String[] arr = {"a", "b", "c", "d", "e"};
            String data = arr[6];
            System.out.println("data = " + data);
        } catch (ArrayIndexOutOfBoundsException e){
            String message = e.getMessage();
            System.out.println("message = " + message);
            e.printStackTrace();
        }
        System.out.println("예외 직접 처리");
    }
    // 예외처리를 메서드 호출하는곳으로 넘긴다.
    public static void method2() throws ArrayIndexOutOfBoundsException{
        String[] arr = {"a", "b", "c", "d", "e"};
        String data = arr[6];
        System.out.println("data = " + data);
    }
}
