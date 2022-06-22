package study.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class Main {
    public static void main(String[] args) {
        /*
        * Builder pattern
        * 1. 필요한 데이터만 설정할 수 있음
        *       -> 생성자 패턴을 사용하면 해당 객체에 필요 없는 데이터를 제외한 생성자 코드를 작성해야함
        * 2.
        * */

        // 필요한 데이터만 설정
        // User user = new User("ad", 123, "asd");
        User user = new User();

    }
    @Getter
    @Setter
    public static class User {
        private String name;
        private int age;
        private String gender;
    }
}


