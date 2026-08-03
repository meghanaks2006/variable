class Calculator
{
        public int add(int n1, int n2)
        {
            return n1 + n2;
        }
}
public class class_object
{
    public static void main(String[]args)
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(4,9);
        System.out.println(r1);
    }
}