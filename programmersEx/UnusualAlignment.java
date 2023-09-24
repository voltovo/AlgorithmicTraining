package programmersEx;

public class UnusualAlignment {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] difflist = new int[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            difflist[i] = Math.abs(numlist[i] - n);
            answer[i] = numlist[i];
        }

        for (int i = 0; i < difflist.length; i++) {
            for (int j = i; j < difflist.length; j++) {
                if (difflist[i] > difflist[j]) {
                    int diffTemp = difflist[i];
                    int numTemp = answer[i];

                    difflist[i] = difflist[j];
                    answer[i] = answer[j];

                    difflist[j] = diffTemp;
                    answer[j] = numTemp;
                } else if (difflist[i] == difflist[j]) {
                    if (answer[i] < answer[j]) {
                        int diffTemp = difflist[i];
                        int numTemp = answer[i];

                        difflist[i] = difflist[j];
                        answer[i] = answer[j];

                        difflist[j] = diffTemp;
                        answer[j] = numTemp;
                    }
                }
            }
        }
        return answer;
    }
}
