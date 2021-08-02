package level1;

/**
 *
 * 위클리 챌린지 1주차
 *
 */
public class Programmers82612 {
    public static void main(String[] args) {
        Programmers82612 programmers82612 = new Programmers82612();
        long answer = programmers82612.solution(3, 20, 4);
        System.out.println(answer);

    }
    public long solution(int price, int money, int count) {
        long answer = price + (price*count);
        answer = (answer * count)/2 - money ;
        return (answer > 0) ? answer : 0;
    }
}
