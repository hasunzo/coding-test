package level1;

/**
 *
 * 핸드폰 번호 가리기
 *
 */
public class Programmers12948 {
    public static void main(String[] args) {
        Programmers12948 programmers12948 = new Programmers12948();
        programmers12948.solution("01033334444");
    }
    public String solution(String phone_number) {
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer.append("*");
        }
        return String.valueOf(answer)+phone_number.substring(phone_number.length()-4, phone_number.length());
    }
}
