package level1;

/**
 *
 * 로또의 최고 순위와 최저 순위
 *
 */
public class Programmers77484 {
    public static void main(String[] args) {
        Programmers77484 programmers77484 = new Programmers77484();
        programmers77484.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
    }
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCount = 0, winCount = 0;

        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0) {
                zeroCount++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        winCount++;
                    }
                }
            }
        }

        int con = 7-(winCount+zeroCount);
        int max = (con > 5) ? 6 : con;
        con = 7-winCount;
        int min = (con > 5) ? 6 : con;

        return new int[] {max, min};
    }
}
