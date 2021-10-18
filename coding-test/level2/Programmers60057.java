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

            int strlength = getStringLength(list);

            if (answer == 0 || answer > strlength) {
                answer = strlength;
            }
        }

        return answer;
    }

    private int getStringLength(List<String> stringList) {
        String targetStr = "";      // 비교 대상
        int numOfRepetitions = 1;   // 반복 횟수
        int strLength = 0;          // 문자열 길이

        Iterator itr = stringList.iterator();

        while (itr.hasNext()) {
            String compareStr = (String) itr.next();

            if (targetStr.equals(compareStr)) {
                numOfRepetitions++;
            } else {
                strLength += getstrLength(targetStr, numOfRepetitions);
                targetStr = compareStr;
                numOfRepetitions = 1;
            }
            strLength += getstrLength(targetStr, numOfRepetitions);
        }

        return strLength;
    }

    private int getstrLength(String tartgetStr, int numOfRepetitions) {
        return (numOfRepetitions == 1) ? tartgetStr.length() : (Integer.toString(numOfRepetitions) + tartgetStr).length();
    }
}
