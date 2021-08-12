package level1;

/**
 *
 * 위클리 챌린지 2주차
 *
 */
public class Programmers83201 {
    public static void main(String[] args) {
        Programmers83201 programmers83201 = new Programmers83201();
        System.out.println(programmers83201.solution(new int[][] {{75, 50, 100}, {75, 100, 20}, {100, 100, 20}}));
    }
    public String solution(int[][] scores) {
        StringBuffer answer = new StringBuffer();

        for(int i = 0; i < scores.length; i++) {
            double avg = 0;
            int max = scores[i][i];
            int min = scores[i][i];
            int sum = scores[i][i];
            boolean overlap = false;

            for(int j = 0; j < scores.length; j++) {
                if(i==j) continue;
                if(scores[j][i]==scores[i][i]) overlap = true;
                if(scores[j][i] >= max) {
                    max = scores[j][i];
                } else if (scores[j][i] <= min) {
                    min = scores[j][i];
                }
                sum += scores[j][i];
            }

            if(!overlap && (max == scores[i][i] || min == scores[i][i])) {
                sum -= scores[i][i];
                avg = (double)sum/(scores.length-1);
            } else {
                avg = (double)sum/scores.length;
            }

            if(avg >= 90) {
                answer.append("A");
                continue;
            } else if (avg >= 80) {
                answer.append("B");
                continue;
            } else if (avg >= 70) {
                answer.append("C");
                continue;
            } else if (avg >= 50) {
                answer.append("D");
                continue;
            } else {
                answer.append("F");
            }
        }

        return String.valueOf(answer);
    }
}
