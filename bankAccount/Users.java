package bankAccount;

import sun.font.DelegatingShape;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Users {
    public String name;
    public String password;
    public String dateOfBirth;
    public String marriageStatus;
    public String haveCard;
    public String relativeName;
    public String relativeAge;
    public String relativeStatus;
    public static String isTransferedSuceesfully;
    public final int accountNumber1;
    public int amountAccount1;
    public final int accountNumber2;
    public int amountAccount2;


    @Override
    public String toString() {
        char[] animationChars = new char[]{'|', '/', '-', '\\'};

        for (int i = 0; i <= 100; i++) {
            System.out.print("Report is being prepared: " + i + "% " + animationChars[i % 4] + "\r");

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "\n\nACCOUNT INFO {" +
                "\n\nName=" + name +
                "\nPassword=" + password +
                "\nDate of Birth=" + dateOfBirth +
                "\nHave a Card=" + haveCard +
                "\nMarriage Status=" + marriageStatus +
                "\nRelative Name=" + relativeName +
                "\nRelative Age=" + relativeAge +
                "\nRelative Status=" + relativeStatus +
                "\nIs Transfered Suceesfully=" + isTransferedSuceesfully +
                "\nAccount Number1=" + accountNumber1 +
                "\nAmount Account1=" + amountAccount1 +
                "\nAccount Number2=" + accountNumber2 +
                "\nAmount Account2=" + amountAccount2 + "\n\n" + '}';
    }

    public int randomNumberCreader() {
        return (int) (Math.random() * (((99999999 - 10000000) + 1)) + 10000000);
    }

    public String checkMariageStatus(String marriageStatus) {
        Scanner input = new Scanner(System.in);
        if (marriageStatus.equalsIgnoreCase("married")) {
            System.out.print("Do you want to add add your relative?(Y/N)");
            String choose = input.nextLine();
            do {

                if (choose.equalsIgnoreCase("Y")) {
                    AddRelative relative = new AddRelative();
                    System.out.print("What is your relative name?");
                    relative.setFullName(input.nextLine());
                    this.relativeName = relative.getFullName();
                    System.out.print("Date of birth relative?(dd/mm/yyyy)");
                    String age = input.nextLine();
                    if (age.length() == 10 && age.replaceAll("[0-9]", "").equalsIgnoreCase("//")) {
                        relative.setAge(age);
                        this.relativeAge = relative.getAge();
                        relative.setRelativeStatus(age);
                        this.relativeStatus = relative.getRelativeStatus();
                    } else System.out.println("You entered the wrong date.\n" +
                            "Could not add date of birth.");
                    return "married";
                } else if (choose.equalsIgnoreCase("N")) {
                    AddRelative relative1 = new AddRelative();
                    return "married";
                } else {
                    System.out.println("Incorrect entry.\nCould not add relative.\nTry again");
                    System.out.print("Do you want to add add your relative?(Y/N)");
                    choose = input.nextLine();
                }

            } while (!(choose.equalsIgnoreCase("y") && choose.equalsIgnoreCase("n")));

        }
        return "married";

    }

    public static boolean checkAge(String myDOB) {
        LocalDate today = LocalDate.now();
        LocalDate dob1 = LocalDate.of(Integer.parseInt(myDOB.substring(6)),
                Integer.parseInt(myDOB.substring(3, 5)),
                Integer.parseInt(myDOB.substring(0, 2)));
        Period age = Period.between(dob1, today);
        if (age.getYears() >= 18)
            return true;
        else return false;
    }

    public static String haveCard(String myDOB) {
        if (checkAge(myDOB) == true)
            return "You can get a credit card";
        else return "You should be at least 18 years old to get a credit card.";
    }

    public void transfer(Users u1, Users u2) {
        Scanner inputStr = new Scanner(System.in);
        System.out.print("Do you want to transfer between your accounts or different user?(own/different)");
        String kimlerArasi = inputStr.nextLine();
        do {
            if (kimlerArasi.equalsIgnoreCase("own")) {
                System.out.print("How much do you want to send?");
                String miktar = inputStr.nextLine();
                if (miktar.replaceAll("[0-9]", "").equalsIgnoreCase("")) {
                    Account.transferToOwnAccount(u1, Integer.parseInt(miktar));
                } else {
                    System.out.println("Incorrect entry.\nTry again.");
                    transfer(u1, u2);

                }
            } else if (kimlerArasi.equalsIgnoreCase("different")) {
                System.out.print("How much do you want to send?");
                String miktar = inputStr.nextLine();
                if (miktar.replaceAll("[0-9]", "").equalsIgnoreCase("")) {
                    Account.transferOtherUser(u1, u2, Integer.parseInt(miktar));
                } else {
                    System.out.println("Incorrect entry.\nTry again.");
                    transfer(u1, u2);
                }
            } else {
                System.out.println("Incorrect entry.\nTry again.");
                System.out.print("Do you want to transfer between your accounts or different user?(own/different)");
                kimlerArasi = inputStr.nextLine();

            }

        } while (!(kimlerArasi.equalsIgnoreCase("own") || kimlerArasi.equalsIgnoreCase("different")));

    }

    public Users(String name, String password, String dateOfBirth, String marriageStatus, int amountAccount1, int amountAccount2) {
        this.name = name;
        this.password = password;
        this.haveCard = haveCard(dateOfBirth);
        this.marriageStatus = checkMariageStatus(marriageStatus);
        this.dateOfBirth = dateOfBirth;
        this.accountNumber1 = randomNumberCreader();
        this.amountAccount1 = amountAccount1;
        this.accountNumber2 = randomNumberCreader();
        this.amountAccount2 = amountAccount2;
        this.relativeName = relativeName;
        this.relativeAge = relativeAge;
        this.relativeStatus = relativeStatus;
    }


}























