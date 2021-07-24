package level1;

/**
 *
 * 수박수박수박수박수박수?
 *
 */
public class Programmers12922 {
    public static void main(String[] args) {
        Programmers12922 programmers12922 = new Programmers12922();
        System.out.println(programmers12922.solution(5));
    }
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        for(int i = 0; i < n/2; i++) {
            answer.append("수박");
        }
        if(n%2!=0) return String.valueOf(answer.append("수"));
        return String.valueOf(answer);
    }
}
