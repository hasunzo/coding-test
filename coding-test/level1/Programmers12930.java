package level1;

import java.util.Locale;

/**
 *
 * 이상한 문자 만들기
 *
 */
public class Programmers12930 {
    public static void main(String[] args) {
        Programmers12930 programmers12930 = new Programmers12930();
        System.out.println(programmers12930.solution("ierjlskdjf jkfjsljf erjkejr"));
    }
    public String solution(String s) {
        s = s.toLowerCase();
        String answer = "";

        int count = 1;

        for(int i=0; i < s.length(); i++) {

            if(s.charAt(i) == 32) {
                count = 1;
                answer += s.charAt(i);
                continue;
            }

            if(count%2==0) {
                answer += s.charAt(i);
            } else {
                answer += (char)(s.charAt(i) - 32);
            }

            count++;

        }

        return answer;
    }
}
