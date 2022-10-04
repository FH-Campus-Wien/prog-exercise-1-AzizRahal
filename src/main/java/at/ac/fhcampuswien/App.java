package at.ac.fhcampuswien;

import org.cef.handler.CefLifeSpanHandler;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char ism = 'Z';
        long jomla = 0xface;
        int rakm = 012;
        long another = 80L;
        float hamazrak = 44e-1f;
        float fasel = 5.5f;
        double lol = 8.88e1;
        double lekhra = 99.9;
        int a = (int)ism;
        int b = (int)jomla;
        int c = (int)rakm;
        int d = (int)another;
        int e = (int)hamazrak;
        int f = (int)fasel;
        int g = (int)lol;
        int h = (int)lekhra;

        int somme = a + b + c + d + e + f + g + h;
            System.out.println(somme);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        input.close();

        result = number1 + number2;

        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();
        System.out.println("Before Swap :");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        int z=x;
        x=y;
        y=z;
        System.out.println("After Swap: ");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1,n2;
        Scanner in = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        input.close();
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);

        if (n1 == n2) {
            System.out.println("n1 == n2");
        }
            else if (n1 > n2) {
                System.out.println("n1 > n2");
            }
            else {
                System.out.println("n2 > n1");
            }
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int Umsatz;
        System.out.println("Enter annual Revenue: ");
        Scanner in = new Scanner(System.in);
        Umsatz = input.nextInt();
        input.close();
        if (Umsatz < 0) {
            System.out.println("Invalid Revenue");
        }
            if (Umsatz >= 100000) {
                System.out.println("Invalid Revenue");
            }
                else if (0 <= Umsatz < 2000) {
                    System.out.println("Poor Sales Revenue");
                }
                    else if (2000 <= Umsatz < 5000) {
                        System.out.println("Average Sales Revenue");
                    }
                        else if (5000 <= Umsatz < 8000) {
                            System.out.println("Good Sales Revenue");
                        }
                            else if (8000 <= Umsatz < 10000) {
                                System.out.println("Excellent Sales Revenue");
                            }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int Cc;
        System.out.println("Enter annual Revenue: ");
        Scanner in = new Scanner(System.in);
        Cc = input.nextInt();
        input.close();
        if (Cc == 1) {
            System.out.println("Your comission rate was set to 0.01");
        }
        if (Cc == 2) {
            System.out.println("Your comission rate was set to 0.02");
        }
        if (Cc == 3) {
            System.out.println("Your comission rate was set to 0.03");
        }
        if (Cc == 4) {
            System.out.println("Your comission rate was set to 0.04");
        }
        else {
            System.out.println("Your comission rate was set to 0.00");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int Jahr;
        Scanner in = new Scanner(System.in);
        Jahr = input.nextInt();
        input.close();
        System.out.println("Year: " + Jahr);
        int leapyear = in.nextInt();
        boolean leapyear =( (leapyear % 4== 0 ) && (leapyear % 100 !=0 ) || (leapyear % 400 == 0));
        if (leapyear){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a leapyear");
        }


    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int Number;
        Scanner in = new Scanner(System.in);
        Number = input.nextInt();
        input.close();
        System.out.println("Number: " + Number);
        int rem,rev=0;

        while(Number!=0)
        {
            rem = Number%10;
            rev = rev*10+rem;
            Number = Number/10;
        }

        System.out.println(rev);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}