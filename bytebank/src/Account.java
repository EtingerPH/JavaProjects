public class Account {

    private double funds = 0;
    private int agency = 0001;
    private int number;
    private Person person;
    private static int index = 0;

    public double getFunds(){
        return this.funds;
    }

    public int getAgency(){
        return this.agency;
    }

    public int getNumber(){
        return this.number;
    }

    public void setFunds(double funds){
        this.funds = funds;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public void getOwnerAndDatas(){
        this.person.personData();
        System.out.println(this.getFunds());
    }

    public boolean withdraw(double value){
        if(this.funds >= value){
            this.funds -= value;
            return true;
        }
        System.out.println("insufficient funds");
        return false;
    }

    public boolean deposit(double value){
        if (value > 0){
            this.funds += value;
            return true;
        }else{
            System.out.println("deposit amount must be greater than zero");
            return false;
        }
    }

    public boolean transfer(double value, Account account){
        if (this.funds > value){
            this.withdraw(value);
            account.deposit(value);
            System.out.println("successful transfer");
            return true;
        }else{
            System.out.println("insufficient funds");
            return false;
        }
    }

}



