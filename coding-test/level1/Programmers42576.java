package level1;

import java.util.Arrays;

/**
 *
 * 완주하지 못한 선수
 *
 */
public class Programmers42576 {
    public static void main(String[] args) {
        Programmers42576 programmers42576 = new Programmers42576();
        System.out.println(programmers42576.solution(new String[]{
                "leo", "kiki", "eden"
        },new String[]{
                "eden", "kiki"
        }));
    }

    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0 ; i < completion.length; i++){
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length -1];
    }

}
