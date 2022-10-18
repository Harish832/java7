package newpackage3;
import java.util.Scanner;
class GFG {
static boolean isVowel(char c) {
    return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
} 
static String pigLatin(String s) {
    int len = s.length();
    int index = -1;
    for (int i = 0; i < len; i++)
    {
        if (isVowel(s.charAt(i))) {
        index = i;
        break;
    }
    }
    if (index == -1)
        return "-1";
    return s.substring(index) +
           s.substring(0, index) + "ay";
}
public static void main(String[] args) {
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    s=sc.next();
    String str = pigLatin(s);
    if (str == "-1")
        System.out.print("No vowels found." +
                         "Pig Latin not possible");
    else
        System.out.print(str);
}
}
