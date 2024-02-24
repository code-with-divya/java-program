import java.io.*;
public class vowel extends Thread
{
    String s1;
    vowel(String s)
    {
        s1=s;
        start();
    }
    public void run()
    {
        System.out.println("vowels are");
        for(int i=0;i){
            charch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'ch=='u'||ch=='A'||ch='E'||ch=='I'||ch='O'||ch='U')
            System.out.println(""+ch);
        }
        public static void main(String[]args) throws Exception
        {
            BufferedReaderbr = new BufferedReaderbr(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String str=br.readline();
            vowel v=new vowel(str);
    

        }
    }
}
    

