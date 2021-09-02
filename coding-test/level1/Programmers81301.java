package level1;

/***
 *
 * 숫자 문자열과 영단어
 *
 */
public class Programmers81301 {
    public static void main(String[] args) {
        Programmers81301 programmers81301 = new Programmers81301();
        System.out.println(programmers81301.solution("one4seveneight"));
    }
    public int solution(String s) {

        String[] engWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < engWord.length; i++) {
            if(s.contains(engWord[i])) {
                s = s.replaceAll(engWord[i], Integer.toString(i));
            }
        }

        return Integer.parseInt(s);
    }
}
