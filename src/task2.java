import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
boolean c;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a string");
        String string = s.nextLine();
        c=palin(string);
        System.out.print(string);
if(c)
    System.out.println(" is  palindrome");
else
    System.out.println(" not  palindrome");
    }
static  boolean palin(String string){
        boolean c;
        StringBuffer b = new StringBuffer(string);
        String string2 = b.reverse().toString();
        if(string.equals(string2))
            c = true;
        else
            c = false;
        return c;
}
}