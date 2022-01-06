import java.util.*;

class ReverseString{

    static String str;
    
    public static void reverse(){
        for (int i=1;i<=str.length();++i)
            System.out.print(str.charAt(str.length() - i));
    }
    public static void main(String [] args){
        System.out.print("Please Input the String ==> ");
        Scanner scn = new Scanner(System.in);
        str = scn.nextLine();
        System.out.println("String recieved = " + str);
        System.out.println("String after reversal");
        reverse();
    }
}