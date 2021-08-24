package level1;

/***
 *
 * 자릿수 더하기
 *
 */
public class Programmers12931 {
    public static void main(String[] args) {
        Programmers12931 programmers12931 = new Programmers12931();
        programmers12931.solution(123);
    }
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(String.valueOf(arr[i]));
        }

        return answer;
    }
}
