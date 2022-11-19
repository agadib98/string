import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        System.out.println("please enter a string");
        String string = s.nextLine();

    int count = Vowel(string);
        System.out.println(" the number of vowels are "+count);
    }


  static int Vowel(String string){
        int count = 0;
        for(int i = 0; i < string.length(); i++){

            if(string.toCharArray()[i] == 'a' |string.toCharArray()[i] == 'e' |string.toCharArray()[i] == 'i' |string.toCharArray()[i] == 'o' |string.toCharArray()[i] == 'u'|string.toCharArray()[i] == 'A' |string.toCharArray()[i] == 'E' |string.toCharArray()[i] == 'I' |string.toCharArray()[i] == 'O' |string.toCharArray()[i] == 'U'  )
                count++;
        }


       return count;
 }

}