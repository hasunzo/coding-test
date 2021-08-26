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
        programmers12915.solution(new String[] {"abcd", "abce", "cdx"}, 2);
    }
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < strings.length; i++) {

            map.put(i, (int)strings[i].charAt(n));
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet, (o1, o2) -> map.get(o1).compareTo(map.get(o2)));

        int index = 0;
        for(Integer key : keySet) {

            answer[index++] = strings[key];
        }

        return answer;
    }
}
