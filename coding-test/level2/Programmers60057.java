package level2;

import java.util.*;

/**
 *
 * 문자열 압축
 *
 */
public class Programmers60057 {
    public static void main(String[] args) {

        Programmers60057 programmers60057 = new Programmers60057();
        System.out.println(programmers60057.solution("stx"));

    }

    public int solution(String s) {
        int answer = 0;

        // i는 자르는 단위 수 (1부터 length까지)
        for (int i = 1; i <= s.length(); i++) {
            // i 크기 만큼 자른 문자열을 담는 리스트
            List<String> list = new ArrayList<String>();

            // s를 i만큼 자르는 과정
            for(int j = 0; j < s.length(); j+=i) {
                try {
                    list.add(s.substring(j, j+i));
                } catch (Exception e) {
                    // 딱 맞아 떨어지지 않을때
                    list.add(s.substring(j, s.length()));
                }
            }

            // 반복 문자열
            String repeat = "";

            // 반복 횟수
            int repeatNum = 1;

            // 문자열 길이
            int strlength = 0;

            Iterator itr = list.iterator();
            while (itr.hasNext()){
                String compareStr = (String) itr.next();

                // 앞 문자열 (repeat)과 같으면 횟수 (repeatNum)을 늘려준다.
                if (repeat.equals(compareStr)) {
                    repeatNum++;

                // 다르면 반복횟수(자리수) + 반복 문자열 계산해서 문자열 길이 합산
                } else {
                    strlength += (repeatNum == 1) ? repeat.length() : (Integer.toString(repeatNum) + repeat).length();
                    repeat = compareStr;
                    repeatNum = 1;
                }
            }
            strlength += (repeatNum == 1) ? repeat.length() : (Integer.toString(repeatNum) + repeat).length();
            if (answer == 0 || answer > strlength) {
                answer = strlength;
            }
        }

        return answer;
    }
}
