class bank{
    String name;
    int age;
    private String password;
    void setpassword(String p)
    {
        password=p;
    }
    void getpassword()
    {
        System.out.println(password);
    }
    void print(){
        System.out.println(name+" "+age+" "+password);

    }
}
public class Encapsulation {
    public static void main(String[] args) {
        bank b=new bank();
        b.name="mohan";
        b.age=21;
        b.setpassword("423nijkm");
        b.getpassword();
        b.print();
    }
    
}
