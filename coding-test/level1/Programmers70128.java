package level1;

/**
 *
 * 내적
 *
 */
public class Programmers70128 {
    public static void main(String[] args) {

        Programmers70128 programmers70128 = new Programmers70128();
        System.out.println(programmers70128.solution(new int[] {1,2,3,4}, new int[]{-3,-1,0,2}));

    }
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += (a[i]) * (b[i]);
        }

        return answer;
    }
}
