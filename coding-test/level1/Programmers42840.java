package level1;

/**
 *
 * 모의고사
 *
 */
public class Programmers42840 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};

            // 1번 수포자 정답 수
            int first = 0;

            // 2번 수포자 정답 수
            int second = 0;

            // 3번 수포자 정답 수
            int third = 0;

            // answers 길이 만큼 반복해서 정답 체크
            for(int i = 0; i < answers.length; i++) {
                // 1번 수포자 체크
                int firstresult = (i+1)%5;
                if (firstresult == 0) firstresult = 5;
                if (firstresult == answers[i]) first++;

                // 2번 수포자 체크
                if ((i+1) % 2 == 0) { // 짝수 일 때
                    switch (((i+1)/2)%4) {
                        case 1:		// 나머지가 1이면 1
                            if (answers[i] == 1) second++;
                            break;
                        case 2:		// 나머지가 2이면 3
                            if (answers[i] == 3) second++;
                            break;
                        case 3:		// 나머지가 3이면 4
                            if (answers[i] == 4) second++;
                            break;
                        case 0:		// 나머지가 0이면 5
                            if (answers[i] == 5) second++;
                            break;
                        default:
                            break;
                    }
                } else { // 홀수 일 때
                    if (answers[i] == 2) second++;
                }

                // 3번 수포자 체크
                switch ((i+1)%10) {
                    case 1:
                    case 2:
                        if (answers[i] == 3) third++;
                        break;
                    case 3:
                    case 4:
                        if (answers[i] == 1) third++;
                        break;
                    case 5:
                    case 6:
                        if (answers[i] == 2) third++;
                        break;
                    case 7:
                    case 8:
                        if (answers[i] == 4) third++;
                        break;
                    case 9:
                    case 0:
                        if (answers[i] == 5) third++;
                        break;
                    default:
                        break;
                }
            }

            // 정렬하기
            for(int i = 0; i < 3; i++) {

                // 큰 수 구하기
                if (first >= second && first >= third) {

                    if (first == second) {
                        if (first == third) {
                            answer = new int[] {1, 2, 3};
                        } else {
                            answer = new int[] {1, 2};
                        }
                    } else if (first == third) {
                        answer = new int[] {1, 3};
                    } else {
                        answer = new int[] {1};
                    }

                    break;

                }
                else if (second > first && second >= third) {

                    if (second == third) {
                        answer = new int[] {2, 3};
                    } else {
                        answer = new int[] {2};
                    }

                    break;
                }
                else {
                    answer = new int[] {3};
                }

            }

            return answer;
        }
    }
}
