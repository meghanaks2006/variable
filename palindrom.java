import java.util.Scanner;
public class palindromCheck{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = Scanner.nextLine();
        scanner.close();
        Steing reversed = new StringBuilder(input).revers().toString();
        if(input.equal(reversed)){
            System.out.println(input + "is palindrome.");
        }else{
            System.out.println(input + "is not palindrome.");
        }
        }
}