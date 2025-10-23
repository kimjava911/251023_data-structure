// 문자열 상세
public class Example02 {
    public static void main(String[] args) {
        // 문자열 -> 내장 메서드
        String text = "programming";
        System.out.println(text.length());
        System.out.println(System.identityHashCode(text)); // 새롭게 만들어서 '다르다'
        // 배열 -> length => 고정된 속성. <-> JS. length => 심지어 임의로 수정할 수도 있음
        // length() <- 메서드.
        // (다른 자료구조의 경우) size()
        text += " is good";
        System.out.println(text.length());
        System.out.println(System.identityHashCode(text)); // immutable 하다

        // 문자열 합치기 (concat, +)
        String front = "Hello, ";
        String back = "world!";
        System.out.println(front.concat(back));
        System.out.println(front + back);

        // 문자열 부분추출 (substring <- sub/string)
        String text2 = "Java is Good!";
        // 오버로딩 -> 같은 메서드 이름인데 매개변수 조합에 따라 다른 호출
        System.out.println(text2.substring(8)); // 시작점부터 끝까지
        System.out.println(text2.substring(5, 8)); // 시작점(포함) - 끝점(미포함)
        System.out.println(text2.substring(0, 4)); // 시작점(포함) - 끝점(미포함)
    }
}
