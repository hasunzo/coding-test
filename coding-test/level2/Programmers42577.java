package level2;

import java.util.Arrays;

/**
 *
 * 전화번호 목록
 *
 */
public class Programmers42577 {
    public static void main(String[] args) {
        Programmers42577 programmers42577 = new Programmers42577();

        System.out.println(programmers42577.solution(new String[]{"1234", "12345", "567"}));

    }
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].indexOf(phone_book[i])==0) return false;
        }

        return answer;
    }
}
