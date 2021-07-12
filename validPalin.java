class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            while(!Character.isLetterOrDigit(s.charAt(i)) && i<j) i++;
            while(!Character.isLetterOrDigit(s.charAt(j)) && i<j) j--;
            if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
        
    }
}