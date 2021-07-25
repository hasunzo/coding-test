package level1;

/**
 *
 * 2016년 *
 */
public class Programmers12901 {
    public static void main(String[] args) {
        Programmers12901 programmers12901 = new Programmers12901();
        System.out.println(programmers12901.solution(5, 24));
    }
    public String solution(int a, int b) {
        String[] dow = new String[] {"THU","FRI","SAT","SUN","MON","THU","WED"};
        int[] month = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for(int i = 0; i < a-1; i++) {
            sum += month[i];
        }
        sum += b;
        return dow[(sum%7)];
    }
}
