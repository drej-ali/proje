package TestClasses;

import bankAccount.Users;

public class TransferDifferentAccount {

    public static void main(String[] args) {

        Users u1 = new Users("David" , "Villa", "10/02/2000", "single" ,2000 , 2000);

        Users u2 = new Users("Xavi" , "Hernandes", "11/12/1998", "single" ,1000 , 2000);


            u1.transfer(u1, u2);

            System.out.println(u1.toString());
            System.out.println(u2.toString());


    }
}
