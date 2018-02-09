package Funçao;
import java.util.Scanner;
public class MaioreMenorde3 {
    private static Scanner lerS;
	static int menorde3 (int X, int Y, int Z)
    {if (X > Y)
        X = Y;
     if (X > Z)
         X = Z;
    return X;}
    static int maiorde3 (int X, int Y, int Z)
    {if (X < Y)
        X = Y;
     if (X < Z)
         X = Z;
    return X;}
    public static void main (String [] args) throws Exception{
        int x, y ,z,a,b,c;
        lerS = new Scanner(System.in);
        System.out.print("Digite o primeiro valor (x) ");
        x = lerS.nextInt();
        System.out.print("Digite o segundo valor (y) ");
        y = lerS.nextInt();
        System.out.print("Digite o terceiro valor (z) ");
        z = lerS.nextInt();
        System.out.println("Menor = "+ menorde3 (x, y, z));       
        
      
        System.out.print("Digite o primeiro valor (a) ");
        a = lerS.nextInt();
        System.out.print("Digite o segundo valor (b) ");
        b = lerS.nextInt();
        System.out.print("Digite o terceiro valor (c) ");
        c = lerS.nextInt();
        System.out.println("Maior = "+ maiorde3 (a, b, c));
    }
    }
