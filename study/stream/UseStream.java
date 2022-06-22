package study.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseStream {
    public static void main(String[] args) {
        
        // Collection Stream 객체 생성
        // Collection 인터페이스에는 stream()이 정의되어 있어 이 메소드를 이용해 Stream 객체를 생성할 수 있다.
        List<String> list = Arrays.asList("a", "b", "c", "d");
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        Stream<String> listStream = list.stream();
        Stream<Map.Entry<String, Integer>> hashMapStream = map.entrySet().stream();


        // 배열 Stream 객체 생성
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> arrayStream = Stream.of(arr);
        Stream<String> stringStream = Stream.of(new String[]{"a", "b", "c", "d"});
        Stream<String> arraysStream = Arrays.stream(new String[]{"a", "b", "c", "d"});

        // Primitive Type Stream 객체 생성
        // IntStream, LongStream, DoubleStream
        IntStream intStream = IntStream.of(1, 2, 3, 4);


        // 데이터 가공

        // filter()
        // 조건에 맞는 데이터만을 정제해서 더 작은 컬렉션을 만들어내는 연산.
        Stream<String> filterStream = list.stream().filter(val->val.contains("a"));
        Stream<String> mapStream = list.stream().map(val -> val.toUpperCase());


    }
}
