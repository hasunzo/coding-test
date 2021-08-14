package level1;

/**
 *
 * 하샤드 수
 *
 */
public class Programmers12947 {
    public static void main(String[] args) {
        Programmers12947 programmers12947 = new Programmers12947();
        System.out.println(programmers12947.solution(10));
    }
    public boolean solution(int x) {
        String str = Integer.toString(x);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }

        return (x%sum==0) ? true : false;
    }
}
