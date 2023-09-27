package programmersEx;

public class LoginSucc {
    public static String solution(String[] id_pw, String[][] db) {
        final String LOGIN = "login";
        final String WRONG_PW = "wrong pw";
        final String FAIL = "fail";
        String loginId = id_pw[0];
        String loginPw = id_pw[1];

        for (String[] userInfo : db) {
            if (loginId.equals(userInfo[0])) {
                if (loginPw.equals(userInfo[1])) {
                    return LOGIN;
                } else {
                    return WRONG_PW;
                }
            }
        }

        return FAIL;
    }
}
