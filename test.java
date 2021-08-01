public class test {

    public static void main(String[] args)
    {
        String str = "abba";
        if(isPalindrome(str))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
   static Boolean isPalindrome(String str)
    {
        String  word = str;
        int len = str.length()-1;
        int i = 0;

        while(i <len)
        {
            if(word.charAt(i) != word.charAt(len))

                return false;

                i++;
                len--;
            


        }
        return  true;

    }
}
