import java.util.*;
class minmax{
    int a[]=new int[100];
    int s;
    int m,n;
    minmax(int a[],int m,int n){
        for (int i = 0; i < a.length; i++) {
            this.a[i]=a[i];
        }
        this.s=a.length;
        this.m=m;
        this.n=n;
    }
    void sort(){
        for (int i = 0; i <s; i++) {
            for (int j = i+1; j < s; j++) {
                if(a[i]>a[j])
                {
                     int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    void min()
    {
        System.out.println("nth minimum:"+a[n-1]);
    }
    void max(){
        System.out.println("mth maximum:"+a[s-m]);
    }
}
public class nth_min_mth_max {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in)
        ; int n=inp.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the nth minimum you required");
        int n1=inp.nextInt();
        System.out.println("Enter the mth maximum you required");
        int m=inp.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter element");
            a[i]=inp.nextInt();
        }
        minmax m1=new minmax(a,n1,m);
        m1.sort();
        m1.min();
        m1.max();
    }
}
