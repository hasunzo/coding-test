package level1;

/**
 *
 * 자연수 뒤집어 배열로 만들기
 *
 */
public class Programmers12932 {
    public static void main(String[] args) {
        Programmers12932 programmers12932 = new Programmers12932();
        programmers12932.solution(12345);
    }
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        int index = 0;
        for(int i = str.length()-1; i >= 0; i--) {
            answer[index++] = str.charAt(i) - 48;
        }
        return answer;
    }
}
