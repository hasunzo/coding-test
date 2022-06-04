package level2;

import java.util.*;

/**
 *
 * 기능개발발 *
 */
public class Programmers42586 {
    public static void main(String[] args) {

        int[] result = {};
        Programmers42586 programmers42586 = new Programmers42586();
        result = programmers42586.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            queue.offer(day);
        }

        while (!queue.isEmpty()) {
            int cnt = 1;
            int pop = queue.poll();
            while (!queue.isEmpty() && pop >= queue.peek()) {
                queue.remove();
                cnt++;
            }
            result.add(cnt);
        }


        int[] answer = new int[result.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;

        //return result.stream().mapToInt(Integer::intValue).toArray(); -- 10배 느림
    }
}
