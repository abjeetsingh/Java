import java.util.*;
public class SwapProg {

    static byte a;
    static byte b;

    public static void replace(){
        byte temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        a = scn.nextByte();
        System.out.print("Enter the value of b = ");
        b = scn.nextByte();
        System.out.println("\nThe value of a and b are \n a = " + a + "\n b = "+b);
        replace();
        System.out.println("The value of a and b are \n a = " + a + "\n b = "+b);
    }
}