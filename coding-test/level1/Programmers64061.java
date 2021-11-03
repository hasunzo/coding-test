package level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 크레인 인형뽑기 게임
 *
 */
public class Programmers64061 {
    public static void main(String[] args) {
        Programmers64061 programmers64061 = new Programmers64061();
        System.out.println(programmers64061.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                new int[] {1,5,3,5,1,2,1,4}));
    }
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        // 뽑힌 인형을 담을 바구니
        List<Integer> basket = new ArrayList<Integer>();

        // 인형을 뽑아보자
        for (int i = 0; i < moves.length; i++) {
            // 인형을 뽑을 위치
            int position = moves[i]-1;

            // 인형을 뽑아서 바구니에 담는다.
            for (int j = 0; j < board.length; j++) {

                // 값이 0이면 빈 칸을 의미
                if (board[j][position] == 0) {
                    continue;
                }

                // 값이 0이 아니면 바구니에 담는다.
                else if (board[j][position] != 0) {

                    // 담기는게 처음이거나 값이 일차하지 않으면 담기만 한다.
                    if (basket.isEmpty() || basket.get(basket.size()-1) != board[j][position]) {
                        basket.add(board[j][position]);
                        board[j][position] = 0;
                        break;
                    }
                    // 담기 전, 마지막에 담긴 바구니와 일치하면 터진다.
                    else if (basket.get(basket.size()-1) == board[j][position]) {
                        // 터짐
                        basket.remove(basket.size()-1);
                        // 터진 개수 카운트
                        answer += 2;
                        board[j][position] = 0;
                        break;
                    }
                }
            }
        }


        return answer;
    }
}
