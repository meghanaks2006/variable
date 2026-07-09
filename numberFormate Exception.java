Import java.util.Scanner;
public class NumberFormatExceptionExample{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter the first number (a):");
            int a=Integer.parselInt(scanner nextLine());
            System.out.println("Enter the secont number (b):");
            int b=Integer.parselInt(scanner.nextInt());
            System.out.println("you entered:a="+a+"b="+b);
        }catcch(NumberFormatExceptionExample e){
            System.out.println("Error please enter valid integer");
        }
        scanner.close();

    }
}