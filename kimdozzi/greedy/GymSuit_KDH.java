import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        HashSet<Integer> re = new HashSet<Integer>();
        for(int i: reserve)
            re.add(i);
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0;i<lost.length;i++){
            if(re.contains(lost[i])) {
                answer++;
                re.remove(lost[i]);
                lost[i]= -1;
            }
        }
        for(int i = 0; i<lost.length;i++) {
            if(re.contains(lost[i]-1)){
                answer++;
                re.remove(lost[i]-1);
            }
            else if(re.contains(lost[i]+1)) {
                answer++;
                re.remove(lost[i]+1);
            }
        }
        return answer;
    }
}