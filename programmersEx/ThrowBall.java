package programmersEx;

public class ThrowBall {
    public static int solution(int [] numbers, int k){
        // 배열 길이 정하기 위해서 k * 2
        int limit = k * 2;
        int [] newNumbers = new int[limit];
        // newNumbers 범위 넘어 가지 않게 하기 위해서 카운팅
        int index = 0;
        while(index < limit){
            for(int num : numbers){
                newNumbers[index] = num;
                index++;
                if(index == limit){
                    break;
                }
            }
        }
        // 새로운 배열의 뒤에서 두번째 값 리턴
        return newNumbers[limit - 2];
    }
}
