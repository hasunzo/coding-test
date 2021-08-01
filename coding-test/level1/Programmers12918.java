package level1;

/**
 *
 * 문자열 다루기 기본
 *
 */
public class Programmers12918 {
    public static void main(String[] args) {
        Programmers12918 programmers12918 = new Programmers12918();
        boolean answer = programmers12918.solution("1e34");
        System.out.println(answer);
    }
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
            }catch (Exception e) {
                return false;
            }
            return true;
        } else return false;
    }
}
