package com.java.day2;


public class Mults {

	public static void main(String[] args) {
		String number1 = "19873458723879523487953298752378958972357892359873248795234897589742387945238794328795238974589237458793425328794578932459872352";
        String number2 = "13384523897570983257890324587932578324875923987532879453248795327489523789452378453248523485283532485234523894752385482345344777";
        int len1=number1.length();
        int len2=number2.length();
        int carry;
        String number;
        String[] add = new String[len2];
        for(int i=len2-1;i>=0;i--)
        {
            number = "";
            carry = 0;
            for(int j=len1-1;j>=0;j--)
            {
                int num=(Integer.parseInt(number1.charAt(j)+"")*Integer.parseInt(number2.charAt(i)+"")+carry);
                carry=num/10;
                num=num%10;
                number=num+number;
            }
            int sizeoflen2 = len2 - 1;
            while (sizeoflen2 > i)
                {
                    number = number + "0";
                    sizeoflen2--;
                }
           
            if (carry == 0)
            {
                add[i] =  number;
            }
            else
            {
                add[i] = carry + number;
            }
            
       }
        int carry1,m,n,x;
        for(x=0;x<len2-1;x++)
        {
            carry1 = 0;
            String stratnum = add[x];
            String endnum = add[x+1];
            int a = stratnum.length();
            int b = endnum.length();
            String s="";
            for (m = a-1, n= b-1;m>=0&&n>=0;m--,n-- )
            {
                int num = Integer.parseInt(stratnum.charAt(m)+"") + Integer.parseInt(endnum.charAt(n)+"") + carry1;
                carry1= num / 10;
                num= num % 10;
                s= num +s;
            }
            if (a < b)
            {
                m = n;
                a = b;
                stratnum = endnum;
            }            
            for (; m >= 0;m-- )
            {
                int sum1 = Integer.parseInt(stratnum.charAt(m) + "") + carry1;
                carry1 = sum1 / 10;
                sum1 = sum1 % 10;
                s = sum1 + s;
            }
            if (carry1 == 0)
            {
                add[x + 1] = s;
            }
            else
            {
                add[x + 1] = carry1+s;
            }
        }
       System.out.println("multiplication of " +number1 + "\n  and  "  +number2 + "\n  is " + add[x]);
	}
}
