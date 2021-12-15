package baseball;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
자바 코드 컨벤션을 지키면서 프로그래밍한다.
기본적으로 Google Java Style Guide을 원칙으로 한다. -https://newwisdom.tistory.com/96
    단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
    예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
else 예약어를 쓰지 않는다.
    힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
3항 연산자를 쓰지 않는다.
함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
*/
public class Baseball {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.print("숫자를 입력해주세요 : ");
        //String value = sc.nextLine();
        //String[] values = value.split("");

        int[] numbers = new int[3];
        int random;

        System.out.println(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
    }
}
