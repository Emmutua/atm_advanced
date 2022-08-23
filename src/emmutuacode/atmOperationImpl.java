package emmutuacode;

public class  atmOperationImpl implements AtmOperationInterF{
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

    }

    @Override
    public void depositAmount(double depositAmount) {

    }

    @Override
    public void viewMiniStatement() {

    }
}
