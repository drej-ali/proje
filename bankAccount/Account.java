package bankAccount;
public class Account {
    public static int deposit(int accountAmount, int amountToAdd) {
        accountAmount += amountToAdd*99/100;
        return accountAmount;
    }
    public static int withDraw(int accountAmount, int withdrawAmount) {
        accountAmount -= withdrawAmount*99/100;
        return accountAmount;
    }

    public static void transferOtherUser(Users sendingUser, Users receivingUser, int transferAmount) {
        if (transferAmount > sendingUser.amountAccount1) {
            System.out.println("Sender is poor lol :)");
            Users.isTransferedSuceesfully="transfer failed";
        } else {
            sendingUser.amountAccount1=withDraw(sendingUser.amountAccount1,transferAmount);
            receivingUser.amountAccount1=deposit(receivingUser.amountAccount1, transferAmount);
            System.out.println("Transaction is completed successfully");
            Users.isTransferedSuceesfully="transfer successful";
        }
    }
    public static void transferToOwnAccount(Users sendingUser, int transferAmount) {
        if (transferAmount > sendingUser.amountAccount1) {
            System.out.println("You need more money dude");
            Users.isTransferedSuceesfully="transfer failed";
        } else {
            sendingUser.amountAccount1=withDraw(sendingUser.amountAccount1, transferAmount);
            sendingUser.amountAccount2=deposit(sendingUser.amountAccount2, transferAmount);
            System.out.println("Transaction is completed successfully");
            Users.isTransferedSuceesfully="transfer successful";
        }
    }

}












