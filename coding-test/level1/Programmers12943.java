package level1;

/**
 *
 * 콜라츠 추측
 *
 */
public class Programmers12943 {
    public static void main(String[] args) {
        Programmers12943 programmers12943 = new Programmers12943();
        System.out.println(programmers12943.solution(7999999));
    }
    public int solution(int num) {
        long number = (long)num;
        if(num==1) return 0;
        for(int i = 1; i <= 500; i++) {
            if(number%2==0) {
                number = number/2;
            } else {
                number = number * 3 + 1;
            }
            if(number == 1 ) return i;
        }

        return -1;
    }
}
