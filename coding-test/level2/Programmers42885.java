package level2;

import java.util.*;

/**
 *
 * 구명보트
 *
 */
public class Programmers42885 {
    public static void main(String[] args) {
        Programmers42885 programmers42885 = new Programmers42885();
        System.out.println(programmers42885.solution(new int[] {40, 100, 95, 88, 70, 50, 40, 55, 50}, 100));
    }
    public int solution(int[] people, int limit) {
        int answer = people.length;

        // 구명보트는 최대 2명까지
        // limit을 넘어가면 안됨.

        Arrays.sort(people);

        // 같이 탈 수 있는 최저 몸무게의 인덱스
        int minIndex = 0;

        for (int i = people.length-1; i > 0; i--) {
            // 나 자신이라면 for문을 멈추기
            if (minIndex == i) break;

            if (people[i] + people[minIndex] <= limit) {
                minIndex++;
                answer--;
            }
        }

        return answer;
    }

}
