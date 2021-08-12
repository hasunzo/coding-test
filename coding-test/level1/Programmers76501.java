package level1;

/**
 *
 * 음양 더하기
 *
 */
public class Programmers76501 {
    public static void main(String[] args) {
        Programmers76501 programmers76501 = new Programmers76501();
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(!signs[i]) {
                absolutes[i] = absolutes[i] * -1;
            }
            answer += absolutes[i];
        }


        return answer;
    }
}
