package level1;

/**
 *
 * 3진법 뒤집기
 *
 */
public class Programmers68935 {
    public static void main(String[] args) {
        Programmers68935 programmers68935 = new Programmers68935();
        System.out.println(programmers68935.solution(45));;
    }
    public int solution(int n) {
        int answer = 0;
        StringBuilder threeNotation = new StringBuilder();
        // n을 3진법으로 변환한다.
        while (n > 0) {
            threeNotation.insert(0, Integer.toString(n%3));
            n /= 3;
        }

        // threeNotation을 앞뒤로 뒤집는다.
        threeNotation = threeNotation.reverse();

        // 10진법으로 변환하기
        answer = Integer.valueOf(threeNotation.toString(), 3);

        return answer;
    }
}
