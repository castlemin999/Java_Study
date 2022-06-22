package study.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Wrapper Class
        * 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없기 때문에 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 한다.
        * 래퍼클래스란 기본타입(Primitive) 타입의 객체화를 뜻한다.
        * 기본타입 : byte, short, int, long, float, double, char, boolean
        * 래퍼클래스 : Byte, Short, Integer, Long, Float, Double, Character, Boolean
        * */

        // Boxing : 기본타입의 데이터를 래퍼클래스 객체로 생성한다.
        Integer Boxing = new Integer(1);

        // UnBoxing : 래퍼클래스 객체를 기본타입으로 변환한다.
        int unBoxing = Boxing.intValue();

        System.out.println("Boxing = " + Boxing);
        System.out.println("unBoxing = " + unBoxing);


        // 매번 Boxing, UnBoxing을 해줄 수 없기 때문에 JDK 1.5 부터 자동으로 변환 시켜준다.
        // Auto Boxing
        Integer autoBoxing = 2;

        // Auto UnBoxing
        int autoUnBoxing = autoBoxing;

        System.out.println("autoBoxing = " + autoBoxing);
        System.out.println("autoUnBoxing = " + autoUnBoxing);


        // Generic을 사용 할때 참조타입 (Reference Type)만 사용할 수 있기 때문에 이때 Wrapper 타입을 넣는다.
        List<Integer> list = new ArrayList<Integer>();
    }
}
