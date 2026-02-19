public class countBinarySubstrings{
    public int countBinarySubstrings(String s){
        // s = "00110011";
        int result = 0;
        int prevCnt = 0;
        int currCnt = 1;

        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
            {
                currCnt++;
            }
            else
            {
                result += Math.min(prevCnt , currCnt);
                prevCnt = currCnt ;
                currCnt=1;
            }
        }
        return  result + Math.min(prevCnt , currCnt);
    }

    public static void main(String args[]){
        countBinarySubstrings cbs = new countBinarySubstrings();
       int r = cbs.countBinarySubstrings("001100110011");
       System.out.println(r);
    }
}