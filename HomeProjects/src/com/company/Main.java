package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Now enter the number please : ");
        //long number = in.nextLong();

        //Intro(in);

        // Division(in);

        //2. Вывести все числа на которые делится данное число
        //for(int i =0; i<90000;i++)
        //туц дшту Ж)

        //Division(in);

        //3. Вывести все простые числа до данного числа :)
        //3.1 Вывести если число простое


        /*System.out.print("Now enter the number please : ");
        number = in.nextInt();

        boolean isPrime = IsPrime(number);

        if (isPrime)
            System.out.println("Your number : " + number +" is prime!");
        else
            System.out.println("Your number: " + number +" isn't prime" );
        for (int i = 1; i <= number; i++ ) {
            long dix = number % (i); //+
            if (dix == 0) //+
                System.out.println("Number " + number + " divides by " + i);
        }*/

       HashMap<Character, String> alphabetEncryption = new HashMap<>();
        alphabetEncryption.put('а', "\u00a5") ;
        alphabetEncryption.put('б', "2");
        alphabetEncryption.put('в',  "\u03F4");
        alphabetEncryption.put('г', "3");
        alphabetEncryption.put('ґ', "4" );
        alphabetEncryption.put('д', "4" );
        alphabetEncryption.put('е', "4" );
        alphabetEncryption.put('є', "4" );
        alphabetEncryption.put('ж', "4" );
        alphabetEncryption.put('з', "4" );
        alphabetEncryption.put('и', "4" );
        alphabetEncryption.put('і', "4" );
        alphabetEncryption.put('ї', "4" );
        alphabetEncryption.put('й', "4" );
        alphabetEncryption.put('к', "4" );
        alphabetEncryption.put('л', "4" );
        alphabetEncryption.put('м', "4" );
        alphabetEncryption.put('н', "4" );
        alphabetEncryption.put('о', "4" );
        alphabetEncryption.put('п', "4" );
        alphabetEncryption.put('р', "4" );
        alphabetEncryption.put('с', "4" );
        alphabetEncryption.put('т', "4" );
        alphabetEncryption.put('у', "4" );
        alphabetEncryption.put('ф', "4" );
        alphabetEncryption.put('х', "4" );
        alphabetEncryption.put('ц', "4" );
        alphabetEncryption.put('ч', "4" );
        alphabetEncryption.put('ш', "4" );
        alphabetEncryption.put('щ', "4" );
        alphabetEncryption.put('ь', "4" );
        alphabetEncryption.put('ю', "4" );
        alphabetEncryption.put('я', "4" );

        String text = in.nextLine();
        String encr = "";
        for(int i=0;i<text.length();i++)
        {
            encr += alphabetEncryption.get(text.charAt(i));
        }

        System.out.print("Encrypted string is : " + encr);

        //3.2 Вывести все простые числа до ...
       /* System.out.print("Now enter the maximum number please : ");
        int number = in.nextInt();

        for (long i = 1; i <= number; i++ ) {
        if (IsPrime(i))
            System.out.println("Number " + i + " is prime");
        */

       /* System.out.print("Now enter number please : ");
        long number = in.nextInt();

        ArrayList<Long> listOfPrimes = new ArrayList<Long>();

        System.out.println("List complete!");

        long rest = number;
        long sqrRest = (long)Math.sqrt(rest);
        System.out.print(number + " = 1");
        for (long i = 2; i <= rest; i++) {
            boolean found = false;
            for (long a : listOfPrimes) {
                if (a>sqrRest)
                    break;
                if (i % a == 0) {
                    found = true;
                    break;
                }
            }
            if (found)
                continue;

            listOfPrimes.add(i);
            while (rest % i == 0) {
                rest = rest / i;
                System.out.print("*" + i);
            }
            sqrRest = (long)Math.sqrt(rest);
        }*/


        //4. Разложить числоа на простые множители (бонус: в порядке возрастания :))

        Thread.sleep(1000);
    }

    //Returns if number is prime or not

    //Возвращает является ли число простым
    private static boolean IsPrimePro(long number, List<Long> primes) {
        //Как решить является ли число простым?

        return true;
    }

    //Возвращает является ли число простым
    private static boolean IsPrime(long number) {
        //Как решить является ли число простым?
        for (long i = 2; i < Math.sqrt(number); i++) {
            long dix = number % (i); //+
            if (dix == 0) {
                return false;
            }
        }
        return true;
    }

    //Небольшое интро про деления
    private static void Intro(Scanner in )
    {
        System.out.print("Please enter user name : ");
        String username = in.nextLine();
        System.out.println("You entered : " + username);
        for (int i=0; i <3; i=i+1 ) {
            System.out.print("Now enter the number please : ");
            int number = in.nextInt();
            System.out.println("Your number : " + number);

            // 1. Вывести если число делится на 2, делится 5, далится на 3

            int div5 = number % 5;
            if (div5 == 0)
                System.out.println("Number " + number + " divides by 5");
            else
                System.out.println("Number " + number + " NOT divides by 5");
            int div2 = number % 2;
            if (div2 == 0)
                System.out.println("Number " + number + " divides by 2");
            else
                System.out.println("Number " + number + " NOT divides by 2");
            int div3 = number % 3;
            if (div3 == 0)
                System.out.println("Number " + number + " divides by 3");
            else
                System.out.println("Number " + number + " NOT divides by 3");
        }

    }

    //Проверяет на какие числа делится число и вывести их на экран
    private static void Division(Scanner in)
    {
        System.out.print("Now enter the number please : ");
        int number = in.nextInt();
        System.out.println("Your number : " + number);


        for (int i = 1; i <= number; i++ ) {
            int dix = number % (i); //+
            if (dix == 0) //+
                System.out.println("Number " + number + " divides by " + i);
        }
    }
}
