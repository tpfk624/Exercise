package programmers;

import java.util.Arrays;

public class code1_1 {
	public static int[] main(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);//원본 배열, 복사할 시작인덱스, 복사할 끝인덱스
            Arrays.sort(temp);
            answer[i]=temp[commands[i][2]-1];
        }
        return answer;
	}
}
