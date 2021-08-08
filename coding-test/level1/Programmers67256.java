package level1;

/**
 *
 * 키패드 누르기
 *
 */
public class Programmers67256 {
    public static void main(String[] args) {
        Programmers67256 programmers67256 = new Programmers67256();


        String answer = programmers67256.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");

        System.out.println(answer);
    }
    public String solution(int[] numbers, String hand) {
        StringBuffer answer = new StringBuffer();

        int L = 10;
        int R = 12;


        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i]==0) {
                numbers[i]=11;
            }

            switch (numbers[i]) {
                // 왼쪽 열 3개의 숫자 1, 4, 7 - 왼손 (L)
                case 1:
                case 4:
                case 7:
                    answer.append("L");
                    L = numbers[i];
                    break;

                // 오른 열 3개의 숫자 3, 6, 9 - 오른손 (R)
                case 3:
                case 6:
                case 9:
                    answer.append("R");
                    R = numbers[i];
                    break;

                // 가운데 2, 5, 8, 0 - 가까운 손가락
                case 2:
                case 5:
                case 8:
                case 11:
                    // 행비교(몫)
                    int quotient = numbers[i]/3;
                    int lnum = (quotient >= L/3) ? quotient-(L/3) : (L/3)-quotient;

                    int rnum = 0;
                    if(R%3==0) {
                        rnum = (quotient >= (R/3)-1) ? quotient-((R/3)-1) : (R/3)-1-quotient;
                    } else {
                        rnum = (quotient >= R/3) ? quotient-(R/3) : (R/3)-quotient;
                    }

                    // 열비교(나머지)
                    if(L%3 != 2) lnum++;
                    if(R%3 == 0) rnum++;

                    // 가까운 손가락
                    if(lnum < rnum) { // 왼손이 더 가까울때
                        answer.append("L");
                        L = numbers[i];
                    }else if (rnum < lnum) { // 오른손이 더 가까울때
                        answer.append("R");
                        R = numbers[i];
                    // 거리가 같으면 오른손잡이 - R / 왼손잡이 - L
                    }else {
                        if(hand.equals("left")) {
                            answer.append("L");
                            L = numbers[i];
                        } else {
                            answer.append("R");
                            R = numbers[i];
                        }
                    }

                    break;

                default:
                    break;
            }

        }

        return String.valueOf(answer);
    }
}
