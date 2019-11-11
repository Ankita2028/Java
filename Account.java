public class Account{
   private String name;
   private long accountNumber;
   private String codeIFSC;
   private double currentAmount;

   public String getName(){
   return name;
}

public long getAccountNumber(){
 return accountNumber;
}

public String getCodeIFSC(){
 return codeIFSC;
 }
 public void setName(String Name){
   this.name= name;
 }
 public void setAccountNumber(long AccountNumber){
   this.accountNumber= accountNumber;
 }
 public void setCodeIFSC(String codeIFSC){
   this.codeIFSC=codeIFSC;
 }
 public void setCurrentAmount(double currentAmount){
   this.currentAmount=currentAmount;
 }
}
class DBCBank{
  public static void main(String[] args){
    for (int i=0; i <1000;i++){
      Account ac = new Account();
      ac.setName("Name"+(i+1));
      ac.setAccountNumber((long)(i+1));
      ac.setCodeIFSC("DBC000"+(i+1));
      ac.setCurrentAmount(0.0);

      System.out.println(ac.getName());
      System.out.println(ac.getAccountNumber());
      System.out.println(ac.getCodeIFSC());
      //System.out.println(ac.)
      //System.out.println(ac.)


    }

  }
}
