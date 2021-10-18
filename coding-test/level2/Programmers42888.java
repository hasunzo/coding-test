package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 오픈채팅방
 *
 */
public class Programmers42888 {
    public static void main(String[] args) {
        Programmers42888 programmers42888 = new Programmers42888();
        String[] answer = programmers42888.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
        for (String str : answer) {
            System.out.println(str);
        }
    }
    public String[] solution(String[] record) {
        Map<String, String> member = new HashMap<String, String>();

        for(int i = 0; i < record.length; i++) {
            // recordDiv[0] = Enter / Leave / Change
            // recordDiv[1] = uid
            // recordDiv[2] = nickname
            String[] recordDiv = record[i].split(" ");
            if (recordDiv[0].equals("Enter") || recordDiv[0].equals("Change")) {
                member.put(recordDiv[1], recordDiv[2]);
            }
        }

        String enterMessage = "님이 들어왔습니다.";
        String leaveMessage = "님이 나갔습니다.";

        List<String> answerList = new ArrayList<String>();

        for (int i = 0; i < record.length; i++) {
            String[] recordDiv = record[i].split(" ");
            if (recordDiv[0].equals("Enter")) {
                answerList.add(member.get(recordDiv[1])+enterMessage);
            } else if (recordDiv[0].equals("Leave")) {
                answerList.add(member.get(recordDiv[1])+leaveMessage);
            }
        }

        return answerList.toArray(new String[answerList.size()]);
    }
}
