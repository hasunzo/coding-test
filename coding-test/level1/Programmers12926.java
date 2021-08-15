package level1;

/**
 *
 * 시저 암호
 *
 */
public class Programmers12926 {
    public static void main(String[] args) {
        Programmers12926 programmers12926 = new Programmers12926();
        System.out.println(programmers12926.solution("a B z", 4));
    }
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();

        for(int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 32){
                answer.append(s.charAt(i));
            }
            else if(s.charAt(i) >= 97 && s.charAt(i)+n > 122) {
                answer.append((char)(s.charAt(i)+n-26));
            }
            else if(s.charAt(i) <= 90 && s.charAt(i)+n > 90) {
                answer.append((char)(s.charAt(i)+n-26));
            } else {
                answer.append((char)(s.charAt(i)+n));
            }
        }

        return answer.toString();
    }
}
