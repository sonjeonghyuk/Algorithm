class Solution {
    public int solution(int[] num_list) {
         int sum1 = 0;
        int sum2 = 0;
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sum1 += num_list[i];
            } else {
                sum2 += num_list[i];
            }
        }

        answer = sum1 > sum2 ? sum1 : sum2;
        return answer;
    }
}