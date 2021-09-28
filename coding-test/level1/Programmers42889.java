package level1;


import java.util.*;
import java.util.Map.Entry;


/**
 *
 * 실패율
 *
 */

public class Programmers42889 {
    public static void main(String[] args) {
        Programmers42889 programmers42889 = new Programmers42889();
        System.out.println(programmers42889.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));

        //1, 2, 2, 2, 3, 3, 4, 6
    }
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Arrays.sort(stages);

        double[] failrate = new double[N];

        for(int i = 0; i < failrate.length; i++) {
            int reachedPlayer = 0;
            int totalReachedPlayer = 0;
            for(int j = stages.length-1; j > -1 && stages[j] >= i+1; j--) {
                if (stages[j] == i+1) reachedPlayer++;
                totalReachedPlayer++;
            }
            if(totalReachedPlayer == 0) continue;
            failrate[i] = (double) reachedPlayer / totalReachedPlayer;
        }

        Map<Integer, Double> map = new HashMap<Integer, Double>();

        for(int i = 0; i < failrate.length; i++) {
            map.put(i+1, failrate[i]);
        }

        List<Entry<Integer, Double>> entries = new ArrayList<Entry<Integer, Double>>(map.entrySet());

        Collections.sort(entries, new Comparator<Entry<Integer, Double>>() {
            public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int index = 0;
        for(Entry<Integer, Double> entry : entries) {
            answer[index++] = entry.getKey();
        }


        return answer;
    }
}
