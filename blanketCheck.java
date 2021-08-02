public class blanketCheck {
    public static void main(String [] args)
    {
        //String str = "((()))()()"; 
        String str = "())((())"; 
        if(checkP(str))
        {
            System.out.println("Balanced");

        }
        else
        {
            System.out.println("Not Balanced");
        }
       


    }

    static boolean checkP(String str)
    {
        boolean flag = true;
        int count = 0;

        for(int i = 0; i<str.length(); i++)
        {
                if(str.charAt(i)=='(')
                {
                    count++;
                }
                else
                {
                    count--;
                }

                if(count<0)
                {
                    flag =false;
                    break;
                }



        }

        if(count!=0)
        {
            flag = false;

        }
        return flag;


    }
    
}
