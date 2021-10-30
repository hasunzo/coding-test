package level1;

public class Programmers87389 {
    public static void main(String[] args) {
        Programmers87389 programmers87389 = new Programmers87389();
        System.out.println(programmers87389.solution(10));
    }
    public int solution(int n) {
        int answer = n;

        // n을 i로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 i
        for (int i = 1; i < n; i++) {
            if (n%i == 1 && i < answer) {
                answer = i;
            }
        }

        return answer;
    }
}
