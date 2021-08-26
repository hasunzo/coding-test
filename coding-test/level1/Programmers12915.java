package level1;

import java.util.*;

/**
 *
 * 문자열 내 마음대로 정렬하기
 *
 */
public class Programmers12915 {
    public static void main(String[] args) {
        Programmers12915 programmers12915 = new Programmers12915();
        programmers12915.solution(new String[] {"sun", "bed", "car"}, 1);
    }
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings);
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            map.put((int) strings[i].charAt(n), strings[i]);
        }

        Object[] mapKey = map.keySet().toArray();
        Arrays.sort(mapKey);

        int index = 0;
        for(Integer keyVal : map.keySet()) {
            answer[index] = map.get(keyVal);
        }

        return answer;
    }
}
