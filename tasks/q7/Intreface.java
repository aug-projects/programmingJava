public class Interface {

    public static void main(String[] args) {

        Country[] countries = {
                new Country("Canada", 3600),
                new Country("Japan", 45600),
                new Country("Germany", 97668)
        };
        System.out.println("The average area of countries is " + Data.avg(countries));

        BankAccount[] bankAccounts = {
                new BankAccount(300000),
                new BankAccount(200000),
                new BankAccount(400000)
        };
        System.out.println("The average balance of bank accounts is " + Data.avg(bankAccounts));

    }
}
