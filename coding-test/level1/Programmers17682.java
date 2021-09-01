package level1;

/**
 *
 * 다트 게임
 *
 */
public class Programmers17682 {
    public static void main(String[] args) {
        String str = "1D2S3T*";
        Programmers17682 programmers17682 = new Programmers17682();
        programmers17682.solution(str);
    }
    public int solution(String dartResult) {
        int answer = 0;

        String newDartResult = dartResult.replaceAll("[*||#]", "");
        String[] scores = newDartResult.split("[\\D]");
        String[] bonusAndOptions = dartResult.split("[\\d]");

        String[][] strings = new String[3][2];

        int index = 0;
        for(int i = 0; i < bonusAndOptions.length; i++) {
            if(!bonusAndOptions[i].equals("")) {
                strings[index][0] = scores[index];
                strings[index][1] = bonusAndOptions[i];
                index++;
            }
        }

        int[] result = new int[3];

        index = 0;
        for(int i = 0; i < strings.length; i++) {
            int score = Integer.parseInt(strings[i][0]);
            String bonusAndOption = strings[i][1];

            switch (bonusAndOption.substring(0, 1)) {
                case "S":
                    result[index] = score;
                    break;
                case "D":
                    result[index] = (int) Math.pow(score, 2);
                    break;
                case "T":
                    result[index] = (int) Math.pow(score, 3);
                    break;
            }

            if(bonusAndOption.length() > 1) {
                switch (bonusAndOption.substring(1, 2)) {
                    case "*":
                        result[index] *= 2;
                        if(index>0) {
                            result[index-1] *= 2;
                        }
                        break;
                    case "#":
                        result[index] *= -1;
                        break;
                }
            }
            index++;
        }

        for(int i = 0; i < result.length; i++) {
            answer += result[i];
        }

        return answer;
    }
}
