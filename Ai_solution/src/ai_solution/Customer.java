package ai_solution;

public class Customer extends standard {
    String mail;
    public Customer (int age, String male, String live, int one,String mail) {
        super(age,male,live,one);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public String toString () {
        return super.toString()+"이메일은 " + " " + this.mail;

    }
}
