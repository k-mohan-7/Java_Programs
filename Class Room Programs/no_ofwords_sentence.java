import java.util.*;
public class no_ofwords_sentence {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in)
        ;
        System.out.println("Enter Sentence mixture of words and sentence");
        String s=inp.nextLine();
        int l=s.length();
        int w=1;
        int sen=1;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                w++;
            }
            if(s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='!')
            {
                sen++;
            }
        }
        System.out.println("No.of Words:"+w+"\nNo.of Sentence is"+sen);
    }
}
