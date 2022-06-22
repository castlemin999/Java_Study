package study.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        /*
        * Optional Class
        * NPE(NullPointException)을 처리하기 위해 null 여부 검사를 해야하는데 변수가 많은 경우
        * 코드가 복잡해지기 때문에 이를 방지하기 위해 사용되는 Wrapper 클래스
        * 성능이 저하 될 수 있기 때문에 반환값이 절대 null이 아니라면 Optional을 사용하지 않는것이 좋다.
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
        Optional<String> optNullable = Optional.ofNullable(nullValue);
        System.out.println("optNullalbe = " + optNullable);
        
        // 비어 있는 Optional 객체생성
        // 조건에 따라 분기를 태워야하고 반환할 값이 없는 경우 사용
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);

        // null일 경우 처리
        // orElse(), orElseGet(), orElseThrow()
        String noNullValue = "Hi!";
        Optional<String> nonNullOptional = Optional.ofNullable(noNullValue);
        String orElse = optNullable.orElse("null 입니다.");                      // null 값 여부와 상관없이 항상 호출
        String orElseGetNull = optNullable.orElseGet(() -> "null 입니다.");            // null 일 때만 호출
        String orElseGetNonNull = nonNullOptional.orElseGet(() -> "null이 아닙니다."); // null 이어서 출력 안됨
        //String orElseThrow = optNullable.orElseThrow(NullPointerException::new);
        System.out.println("orElse = " + orElse);
        System.out.println("orElseGetNull = " + orElseGetNull);
        System.out.println("orElseGetNonNull = " + orElseGetNonNull);
        //System.out.println("orElseThrow = " + orElseThrow);

    }
}
