package study.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        * Optional Class
        * NPE(NullPointException)을 처리하기 위해 null 여부 검사를 해야하는데 변수가 많은 경우
        * 코드가 복잡해지기 때문에 이를 방지하기 위해 사용되는 Wrapper 클래스
        * */

        String nullValue = null;

        // 기존 null 처리 코드
        if( nullValue != null ){
            String npe = nullValue.toUpperCase();
            System.out.println("npe = " + npe);
        } else {
            System.out.println("Null값은 처리 할 수 없습니다.");
        }

        // Optional 객체 사용 코드

        // value가 null 인 경우 NPE 던짐
        // 값이 반드시 있는 경우 사용
        // Optional<String> optOf = Optional.of(nullValue);
        // System.out.println("optOf = " + optOf);

        // value가 null 인 경우 Optional 객체 반환
        // 값이 null 일수도 경우 사용
        Optional<String> optNullalbe = Optional.ofNullable(nullValue);
        System.out.println("optNullalbe = " + optNullalbe);
        
        // 비어 있는 Optional 객체생성
        // 조건에 따라 분기를 태워야하고 반환할 값이 없는 경우 사용
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);

    }
}
