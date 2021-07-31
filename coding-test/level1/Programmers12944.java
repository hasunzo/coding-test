package level1;

/**
 * 
 * 평균 구하기
 * 
 */
public class Programmers12944 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i<arr.length; i++) {
            answer += arr[i];
            if(i==arr.length-1) {
                answer = (answer/arr.length);
            }
        }
        return answer;
    }
}
