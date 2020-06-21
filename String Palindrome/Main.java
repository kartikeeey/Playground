import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      	Scanner in =  new  Scanner(System.in);
        String str = in.nextLine();
        String temp="";
        int n = str.length();
        for(int i=(n-1);i>=0;i--)
            temp+=str.charAt(i);
        if (str.equals(temp)) 
            System.out.println("Yes");
        else 
            System.out.println("No");
    } 
}