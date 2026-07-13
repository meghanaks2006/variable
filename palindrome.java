import java.util.Scanner;
 class PalindromeCheck{
    public static void main (String[]a){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=scanner.nextLine();
        scanner.close();
        String revers=new StringBuilder(input).reverse().toString();
        if(input.equals(revers)) {
            System.out.println(input+"is palindrome");
        }else{
            System.out.println(input+"is not palindrome");
        }
        }
    }
