//package OOPs;

public class _02_ {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
    myAccount.username = "tanya01";
    myAccount.setPassword("tanu1");
    //can not access password directly
  }
}

class BankAccount {
  public String username;
  private String password;

  public void setPassword(String pwd) {
    this.password = pwd;
  }
}
