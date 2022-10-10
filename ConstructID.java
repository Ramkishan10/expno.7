package ex.pkg7;
import java.util.Scanner;

public class ConstructID {
    public static void main(String[] args) {
        GetID gi=new GetID();
        while(true)
        {
            gi.get();
            gi.Infor();
        }
    
    }
}
class GetID
{
    String name;
    String adress;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter FULL name-->:");
        name = sc.nextLine();
        System.out.println("Enter Adress-->:");
        adress=sc.nextLine();
    }
    void Infor()
    {
        String FirstLetter=" ";
        String NumInAd="";
        String namesplit[]=name.split(" ");
        for(String s:namesplit)
        {
            FirstLetter+=Character.toUpperCase(s.charAt(0));
        }
        char ad[]=adress.toCharArray();
        for(char s1:ad)
        {
            if(Character.isDigit(s1))
            {
                NumInAd+=s1;
            }
        }  
        System.out.println("ID-->:"+FirstLetter+NumInAd);
    }
}