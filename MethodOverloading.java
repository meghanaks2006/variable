public class MethodOverloadingExample{
    public void display(int a){
        System.out.println("Argument:"+a);
    }
    public void display (int a,int b){
        System.out.println("Argument:"+a"and"+b);
    }
    public void display(String a){
        System.out.println("Argument:"+a);
}
public static void main(String[]args){
    MethodOverloadingExample obj=new MethodOverloadingExample();
    obj.display(10);
    obj.display(10,20);
    obj.display("hello");
}
}