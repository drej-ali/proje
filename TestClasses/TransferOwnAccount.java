package TestClasses;

import bankAccount.Users;


public class TransferOwnAccount {


    public static void main(String[] args) {
        Users u1 = new Users("Steven" , "Gerard", "10/02/2002", "single" ,1000 , 2000);


            u1.transfer(u1,u1);

            System.out.println(u1);}



}
