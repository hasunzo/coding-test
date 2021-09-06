package level1;

/**
 *
 * 정수 제곱근 판별
 *
 */
public class Programmers12934 {
    public static void main(String[] args) {
        Programmers12934 programmers12934 = new Programmers12934();
        programmers12934.solution(121);
    }
    public long solution(long n) {

        double sqrt = Math.sqrt(n);

        return (sqrt%1) == 0 ? (long) Math.pow(++sqrt, 2) : -1;
    }
}
