package level1;

/**
 *
 * 서울에서 김서방 찾기
 *
 */
public class Programmers12919 {
    public static void main(String[] args) {
        Programmers12919 programmers12919 = new Programmers12919();
        System.out.println(programmers12919.solution(new String[] {"Jane", "Kim"}));
    }
    public String solution(String[] seoul) {
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return null;
    }
}
