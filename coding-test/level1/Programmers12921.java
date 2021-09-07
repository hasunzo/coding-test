package level1;

/**
 *
 * 소수 찾기
 *
 */
public class Programmers12921 {
    public static void main(String[] args) {
        Programmers12921 programmers12921 = new Programmers12921();
        programmers12921.solution(10);
    }
    public int solution(int n) {
        int answer = 0;

        boolean[] arr = new boolean[n+1];

        arr[0] = false;
        arr[1] = false;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        int sqrt = (int)Math.sqrt(n);

        for(int i = 2; i <= sqrt; i++) {
            for(int j = i*i; j <= n; j += i){
                arr[j] = false;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) answer++;
        }

        return answer;
    }
}
