public class CreateAccount {

    public static void main(String[] args) {

        Person chester = new Person();

        chester.setName("Chester");
        chester.setAge(5);
        chester.setCpf("000.000.000-00");

        Account account = new Account();

        account.setPerson(chester);
        account.setFunds(1000);

        Account account1 = new Account();
        account1.setFunds(200);
        account1.setPerson(chester);

        System.out.println("Testing");
    }
}
