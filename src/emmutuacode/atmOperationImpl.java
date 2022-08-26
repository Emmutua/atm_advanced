package emmutuacode;

import java.util.HashMap;
import java.util.Map;

public class  atmOperationImpl implements AtmOperationInterF{
    ATM atm = new ATM();
    Map<Double , String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%100==0) {
            ministmt.put(withdrawAmount, " Amount Withdrawn");
            if (withdrawAmount <= atm.getBalance()) {
                System.out.println("Collect Cash: " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance!!!");
            }
        }
        else{
                System.out.println("Please Enter Withdraw amount in 100's");
            }
        }

    @Override
    public void depositAmount(double depositAmount) {
        if(depositAmount%100==0){
        ministmt.put(depositAmount, " Amount Deposited");

        System.out.println(depositAmount + "Deposited Successfully !!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
        }else {
            System.out.println("Enter Deposit Amount In 100's");
        }

    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String > m: ministmt.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
