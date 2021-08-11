package level1;

/**
 *
 * 짝수와 홀수
 *
 */
public class Programmers12937 {
    public static void main(String[] args) {
        Programmers12937 programmers12937 = new Programmers12937();
        System.out.println(programmers12937.solution(0));
    }
    public String solution(int num) {

        return (num%2==0) ? "Even" : "Odd";
    }
}
