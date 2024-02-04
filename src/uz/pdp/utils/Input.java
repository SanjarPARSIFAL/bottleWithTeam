package uz.pdp.utils;

import java.util.Scanner;

public interface Input {
    static int INT(String sms){
        Scanner scanner = new Scanner(System.in);
        System.out.print(sms);
        if (scanner.hasNextBigInteger()){
            return scanner.nextInt();
        }else {
            return INT(sms);
        }
    }
    static String STRING(String sms){
        Scanner scanner = new Scanner(System.in);
        System.out.print(sms);
        return scanner.nextLine();
    }

}
