package level1;

public class Programmers161990 {
    public static void main(String[] args) {
        Programmers161990 programmers161990 = new Programmers161990();
        int[] solution = programmers161990.solution(new String[]{
                ".##...##.",
                "#..#.#..#",
                "#...#...#",
                ".#.....#.",
                "..#...#..",
                "...#.#...",
                "....#...."});
        System.out.println(solution);
    }
    public int[] solution(String[] wallpaper) {
        int minX = 50, minY = 50, maxX = 0, maxY = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            if (!wallpaper[i].contains("#")) continue;
            minX = Math.min(i, minX);
            maxX = Math.max(i + 1, maxX);
            for (int j = 0; j < wallpaper[i].length(); j++) {
                int tempMinY = wallpaper[i].indexOf("#");
                minY = Math.min(tempMinY, minY);
                int tempMaxY = wallpaper[i].lastIndexOf("#") + 1;
                maxY = Math.max(tempMaxY, maxY);
            }
        }

        return new int[]{minX, minY, maxX, maxY};
    }
}
