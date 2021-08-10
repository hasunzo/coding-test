package level1;

import java.util.Locale;

/**
 *
 * 문자열 내 p와 y의 개수
 *
 */
public class Programmers12916 {
    public static void main(String[] args) {
        Programmers12916 programmers12916 = new Programmers12916();
        System.out.println(programmers12916.solution("Pyy"));
    }
    boolean solution(String s) {
        s = s.toUpperCase();

        int num = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 80) {
                num++;
            } else if (s.charAt(i) == 89) {
                num--;
            }
        }

        return (num == 0) ? true : false;
    }
}
