class Solution {
    public int solution(int num1, int num2) {
        double div = (double)num1/(double)num2;
        System.out.println(div);
        double answer = div*1000;
        return (int)answer;
    }
}