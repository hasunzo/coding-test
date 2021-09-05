package level1;

import java.util.Arrays;

/**
 *
 * 정수 내림차순으로 정렬하기
 *
 */
public class Programmers12933 {

    public long solution(long n) {
        long answer = 0;
        String toStr = Long.toString(n);
        char[] arr = toStr.toCharArray();
        Arrays.sort(arr);
        String str = "";
        for(int i = 1; i <= arr.length; i++) {
            str += arr[arr.length-i];
        }
        return Long.parseLong(str);
    }
}
