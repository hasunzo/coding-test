package level2;

/**
 *
 * JadenCase 문자열 만들기
 *
 */
public class Programmers12951 {
    public static void main(String[] args) {
        Programmers12951 programmers12951 = new Programmers12951();
        System.out.println(programmers12951.solution("for the last week"));

    }
    public String solution(String s) {
        StringBuffer answer = new StringBuffer(s.toLowerCase());
        answer.replace(0, 1, String.valueOf(answer.charAt(0)).toUpperCase());

        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(count == 0) answer.replace(i, i+1, String.valueOf(answer.charAt(i)).toUpperCase());
            if(answer.charAt(i) == 32) {
                count = 0;
            } else {
                count++;
            }
        }

        return answer.toString();
    }
}
