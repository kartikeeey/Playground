import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        int n1=str1.length();
        int n2=str2.length();
        int res=0;
        for(int i=0;i<=(n1-n2);i++)
        {
            int j;
            for(j=0;j<n2;j++)
                if(str1.charAt(i+j)!=str2.charAt(j))
                    break;
            if(j==n2)
            {
                res++;
                j=0;
            }
        }
        System.out.print(res);
  } 
}