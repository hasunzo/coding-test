package level1;

/**
 *
 * 신규 아이디 추천
 *
 */
public class Programmers72410 {
    public static void main(String[] args) {
        Programmers72410 programmers72410 = new Programmers72410();
        System.out.println(programmers72410.solution("=.="));
    }
    public String solution(String new_id) {
        new_id = new_id.toLowerCase().replaceAll("[^0-9a-z\\-._..]", "");
        new_id = new_id.replaceAll("\\.+", ".");

        try {
            if(new_id.substring(0, 1).equals(".")) new_id = new_id.substring(1, new_id.length());
            if(new_id.substring(new_id.length()-1, new_id.length()).equals(".")) new_id = new_id.substring(0, new_id.length()-1);
        } catch (Exception e) {
            new_id = "";
        }

        if(new_id.length() == 0) new_id = "a";
        if(new_id.length() > 15) new_id = new_id.substring(0, 15);
        if(new_id.substring(new_id.length()-1, new_id.length()).equals(".")) new_id = new_id.substring(0, new_id.length()-1);
        if(new_id.length() < 3) {
            for(int i = 0; new_id.length() < 3; i++) {
                new_id += new_id.substring(new_id.length()-1, new_id.length());
            }
        }

        return new_id;
    }
}
