package level1;

import java.util.Arrays;

/**
 *
 * 8주차 최소 직사각형
 *
 */
public class Programmers86491 {
    public int solution(int[][] sizes) {

        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        int wid = 0;
        int hei = 0;

        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > wid) wid = sizes[i][0];
            if(sizes[i][1] > hei) hei = sizes[i][1];
        }

        return wid*hei;
    }
}
