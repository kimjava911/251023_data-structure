// List / ArrayList
import java.util.LinkedList;
import java.util.List; // interface -> 약속.
// List <- '구현'. ArrayList, LinkedList...
import java.util.ArrayList; // class. <- 실제 List를 구현한.

public class Example05 {
    public static void main(String[] args) {
        // 배열 -> 속도. -> 길이가 가변적이지 않다
        // List (Collection)
        // 배열 타입[] 이름...
        // Wrapper 클래스
        // <> -> Generic -> 다양한 '클래스/참조' 타입을 대응할 수 있게 한 설계 -> 원시 타입을 못 넣음.
//        List<int>
        // Wrapper -> 기본(원시) 타입 대신에 사용해줄 수 있는 참조 타입
        // int - Integer, long -> Long, double -> Double,
        // boolean -> Boolean, char -> Character
        List<Integer> list = new ArrayList<>(); // 범용적이고 array와 유사한 내적 구조
        // 약속<타입> list = new 실제로구현된클래스<>();
        List<Integer> list2 = new LinkedList<>(); // Queue. 특정한 문제/구현 쓰이는 것.
        // 둘의 메서드나 호출할 수 있는 멤버변수(필드)는 실질적으로 동일

        // list.add(값) -> 추가할 수록 길이가 '늘어난다'
        // list.get(인덱스) -> 값 불러오기
        // list.set(인덱스, 값) -> 해당 값에 덮어 씌우기
        // list.clear() -> 전체 지우기
        // -> 한번에 다 지울 수 있다
        // list.remove() -> 값, 인덱스 찾아서 삭제
        // for, for-each(향상된 for문)
        // size(), contains, sort, clone...
    }
}
