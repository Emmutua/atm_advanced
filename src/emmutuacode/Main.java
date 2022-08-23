package emmutuacode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterF op = new atmOperationImpl();

        int atmNumber = 12345;
        int atmPin = 1212;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter the Atm Number: ");
        int atmnumber = in.nextInt();
        System.out.print("Enter Pin: ");
        int pin = in.nextInt();

        if((atmNumber==atmnumber) && (atmPin==pin)){

            while (true){
                System.out.println("1. View Available Balance \n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini_statement\n5. Exit");
                System.out.println("Enter Choice");
                int ch = in.nextInt();
                if(ch==1){
                    op.viewBalance();
                } else if (ch==2) {

                } else if (ch==3) {

                } else if (ch==4) {

                } else if (ch==5) {
                    System.out.println("Collect Your Atm card\n Thanks for using the ATM Machine");
                    System.exit(0);
                }else {
                    System.out.println("Wrong Choice!!!");
                }

            }

        }else {
            System.out.println("Incorrect Atm number or pin");
            System.exit(0);
        }




    }
}