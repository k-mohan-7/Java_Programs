import java.util.*;
class multi{
    int n;
    int m;
    void input(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter which tabel you need");
         n=inp.nextInt();
        System.out.println("Enter upto which you need the table "+n);
        m=inp.nextInt();
    }
    void table()
    {
       for (int i = 1; i <=m; i++) {
        System.out.println(n+"*"+i+"="+n*i);
       }
    }
}
public class multiplicationoops {
    public static void main(String[] args) {
        
        multi m=new multi();
        m.input();
        m.table();
    }
}
