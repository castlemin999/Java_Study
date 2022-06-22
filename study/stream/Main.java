package study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*
        * Stream API
        * Java 8에서 추가된 java.util.stream 패키지
        * 컬렉션 객체에 저장되어 있는 엘리먼트들을 하나씩 순회하면서 처리할 수 있는 코드패턴.
        * 람다식과 함께 사용되어 간결한 표현으로 작성가능.
        *
        * 1. 데이터 소스에 대한 공통의 접근 방식 제공
        * 2. 중간 처리와 최종 처리를 지원
        * 3. 원본의 데이터를 변경하지 않는다.
        * */

        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        // 기존 컬렉션 객체 엘리먼트 순회 코드
        System.out.println("-----Using while-----");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String value = iter.next();
            if(value.equals("B")){
                System.out.println("value = " + value);
            }
        }

        System.out.println("-----Using for-----");
        for (String value : list) {
            if(value.equals("B")){
                System.out.println("value = " + value);
            }
        }
        /////////////////////////////////////



        // Stream API 사용 컬렉션 객체 엘리먼트 순회 코드
        System.out.println("-----Using Stream-----");
        Stream<String> stream = list.stream();                                      // 1. Stream 객체 생성
        Stream<String> filterdStream = stream.filter(value -> value.equals("B"));   // 2. 값 가공
        filterdStream.forEach(val -> System.out.println("val = " + val));           // 3. 결과 만들기

        // 한줄로 표현
        list.stream()                           // 1. stream 생성
            .filter(val -> val.equals("B"))     // 2. 값 가공
            //.filter("B"::equals)
            .forEach(System.out::println);      // 3. 결과 만들기
        /////////////////////////////////////

    }
}
