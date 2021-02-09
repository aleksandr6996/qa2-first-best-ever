package homeworks;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

                //METOD PO VISCITIVANIJU CREDITA

public class Homework2 {

        public Integer loan = 10000;
        public Integer years = 20;
        public double interestRate = 20.00;

        @Test
        public void creditReturn(){
            System.out.println("Loan is : " + loan);
            System.out.println("Interest rate is : " + sumOfPercent(loan, years, interestRate));
            double sum = sumOfPercent(loan, years, interestRate);
            System.out.println("Loan return : " + loanReturn(sum, loan));


        }

       public double sumOfPercent(Integer loan, Integer years, double interestRate){
            double d = loan*interestRate/100 * years;
            return d;
        }
        public int loanReturn (double d, Integer loan){
            double c = d + loan;
            return (int) c;
        }

//        }
//        String s = "Я стану отличным программистом!";
//        int len = s.length();
//
//        System.out.println( "Длина строки: " + len + " символ.");
//        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
//        System.out.println("Введите слова одной строкой через пробел");
//        String input = sc.nextLine();
        //Начальное количество слов равно 0
//        int count = 0;

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
//        if(input.length() != 0){
//            count++;
//            //Проверяем каждый символ, не пробел ли это
//            for (int i = 0; i < input.length(); i++) {
//                if(input.charAt(i) == ' '){
//                    //Если пробел - увеличиваем количество слов на 1
//                    count++;
                }
//            }
//        }
//
//        System.out.println("Вы ввели "+count+" слов");
//    }



