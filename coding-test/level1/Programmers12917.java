package level1;

/**
 *
 * 문자열 내림차순으로 배치하기
 *
 */
public class Programmers12917 {
    public static void main(String[] args) {
        Programmers12917 programmers12917 = new Programmers12917();
        System.out.println(programmers12917.solution("Zbcdefg"));
    }
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s);
        for(int i=0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(answer.charAt(i) < answer.charAt(j)) {
                    char temp = answer.charAt(i);
                    answer.setCharAt(i, answer.charAt(j));
                    answer.setCharAt(j, temp);
                }
            }
        }
        return String.valueOf(answer);
    }
}
