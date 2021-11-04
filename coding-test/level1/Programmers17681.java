package level1;

/**
 *
 * 비밀지도
 *
 */
public class Programmers17681 {
    public static void main(String[] args) {
        Programmers17681 programmers17681 = new Programmers17681();
        String[] answer = programmers17681.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

        for (String s : answer) {
            System.out.println(s);
        }
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String format = "%"+n+"s";

        for (int i = 0; i < arr1.length; i++) {
            // 10진수를 2진수로 변환하기 > Integer.toBinaryString 사용
            String arr1Str = Integer.toBinaryString(arr1[i]);
            String arr2Str = Integer.toBinaryString(arr2[i]);


            // arrStr이 n보다 짧으면 0으로 채운다
            arr1Str = String.format(format, arr1Str).replace(" ", "0");
            arr2Str = String.format(format, arr2Str).replace(" ", "0");

            StringBuilder finalStr = new StringBuilder();
            // arr1Str + arr2Str 합치기
            for (int j = 0; j < arr1Str.length(); j++) {
                if (arr1Str.charAt(j)==49 || arr2Str.charAt(j)==49) {
                    finalStr.append("#");
                } else {
                    finalStr.append(" ");
                }
            }

            answer[i] = finalStr.toString();

        }

        return answer;
    }
}
