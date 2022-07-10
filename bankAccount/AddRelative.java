package bankAccount;

public class AddRelative {
    public static String fullName;
    public static String age;
    public static String relativeStatus;

    public static String getRelativeStatus() {
        return relativeStatus;
    }

    public void setRelativeStatus(String age) {
        if (Users.checkAge(age) == true) {
            this.relativeStatus="Your relative is over 18 years old.";
        } else {
            this.relativeStatus = "Your relative is under 18 years old.";
        }
    }

    public AddRelative(String fullName, String age,String age1) {
        setFullName(fullName);
        setAge(age);
        setRelativeStatus(age);
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

    /*
       ---Parametresi String relativeAge ve return tipi boolean olan
          relativeAgeChecker  methodunu oluşturun
       --- Eğer relativeAge 18 den büyük veya eşit ise true return et
           aksi halde false return et

       Not :  Users class checkAge methodunu kullan


     */
//--------------------------------------------------------------------------------------------------







