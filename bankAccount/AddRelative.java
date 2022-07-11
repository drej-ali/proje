package bankAccount;

public class AddRelative {
    public static String fullName;
    public static String age;
    public static String relativeStatus;

    public AddRelative() {
    }

    public  String getRelativeStatus() {
        return relativeStatus;
    }

    public void setRelativeStatus(String age) {
        if (Users.checkAge(age) == true) {
            this.relativeStatus="Your relative is over 18 years old.";
        } else {
            this.relativeStatus = "Your relative is under 18 years old.";
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}





