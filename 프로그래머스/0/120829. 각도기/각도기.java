class Solution {
    public int solution(int angle) {
        int ans=0;
        String gak = null;
        
        if(0<angle && angle<90)
            gak="yegak";
        else if(angle==90)
            gak="jikgak";
        else if(90<angle && angle<180)
            gak="dungak";
        else
            gak="peonggak";
        
        switch(gak){
            case "yegak":
                ans=1;
                break;
            case "jikgak":
                ans=2;
                break;
            case "dungak":
                ans= 3;
                break;
            case "peonggak":
                ans= 4;
                break;
        }
        return ans;
    }
}