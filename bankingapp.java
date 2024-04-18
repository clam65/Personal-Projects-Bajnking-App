import java.util.Scanner

public class bankingapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bankingops bkops = new Bankingops(String cname="Tony", String cid="01);
        bkops.showMenu();
    }

    class Bankingops {
        int balance;
        int previousTransaction;

        Bankingops(String cname, String cid="01") {
            customerName = cname;
            customerId - cid;
        }
        
        void deposit(int amount) {
            if (amount != 0) {
                balance += amount;
                previousTransaction = amount;
                System.out.println("You have deposited:" + amount.);
                System.out.println("Your new balance is:" + balance);
            }
        }

        void withdrawal(int amount) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("You have withdrawed:" + amount.);
            System.out.println("Your new balance is:" + balance);
        }

        void showBalance() {
            System.out.println("Your balance is:" + balance );        
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("You have deposited" + previousTransactiton);
            }
            else if (previousTransaction < 0) {
                System.out.printnln("You have withdrawn" + Math.abs(previousTransaction));
            }
        }

        void showMenu() {
            
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            option = scanner.next().charAt();
            
            System.out.println("Hi" + customerName + "Good day!");
            System.out.println("Your Customer Indetification Number is:" + customerId);
            System.out.println("======================================================");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Show Balance");
            System.out.println("4.Show Previous Transaction");
            System.out.println("5. EXit");
            
            do {
            
                System.out.println("=================================================");")
                System.out.println(Please enter your option:");
                option = scanner.next().charAt(0);

                    switch (option.toUpperCase()) {

                        case 'A':
                           
                            System.out.println("****************************************");
                            System.out.println("Please enter the amount to deposit");
                            System.out.println("****************************************");
                            int amount = scanner.nextInt();
                            deposit(amount);
                            break;

                        case 'B':
                            
                            System.out.println("****************************************");
                            System.out.println("Please enter the amount to deposit");
                            System.out.println("****************************************");
                            int amount2 = scanner.nextInt();
                            withdrawal(amount2);
                            break;

                        case 'C':

                            showBalance();
                            break;

                        case 'D':

                            getPreviousTransaction();
                            break;

                        case 'E':

                            break;
                
                        default:
                        
                            System.out.println("Please choose you option again");
                            showMenu();
                    }
            } while (option.toUpperCase() != "E")
        }
    }


/* import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingOps bkops = new BankingOps("Tony", "01");
        bkops.showMenu();
    }

    static class BankingOps {
        String customerName;
        String customerId;
        int balance;
        int previousTransaction;

        BankingOps(String cname, String cid) {
            customerName = cname;
            customerId = cid;
        }

        void deposit(int amount) {
            if (amount != 0) {
                balance += amount;
                previousTransaction = amount;
                System.out.println("You have deposited: " + amount);
                System.out.println("Your new balance is: " + balance);
            }
        }

        void withdrawal(int amount) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("You have withdrawn: " + amount);
            System.out.println("Your new balance is: " + balance);
        }

        void showBalance() {
            System.out.println("Your balance is: " + balance);
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("You have deposited: " + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("You have withdrawn: " + Math.abs(previousTransaction));
            }
        }

        void showMenu() {
            String option = "";
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Hi " + customerName + ", Good day!");
                System.out.println("Your Customer Identification Number is: " + customerId);
                System.out.println("======================================================");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Show Balance");
                System.out.println("4. Show Previous Transaction");
                System.out.println("5. Exit");

                System.out.println("=================================================");
                System.out.println("Please enter your option:");
                option = scanner.next().charAt(0);

                switch (Character.toUpperCase(option.charAt(0))) {
                    case '1':
                        System.out.println("****************************************");
                        System.out.println("Please enter the amount to deposit");
                        System.out.println("****************************************");
                        int depositAmount = scanner.nextInt();
                        deposit(depositAmount);
                        break;

                    case '2':
                        System.out.println("****************************************");
                        System.out.println("Please enter the amount to withdraw");
                        System.out.println("****************************************");
                        int withdrawalAmount = scanner.nextInt();
                        withdrawal(withdrawalAmount);
                        break;

                    case '3':
                        showBalance();
                        break;

                    case '4':
                        getPreviousTransaction();
                        break; */

export const message = "Hello";
export const age = 40;


export printout = () => {

    coonsole.log("This is a program");
}

export default printout;

let text = '{"employees": [{"firstname": "Anna"}, {"firstname": "Tony"}, {"Firstname":"Peter"}]}'
const obj = text.parse(text);

console.log(`The second person on the employees' list is ${employees.obj[1]})

/*
https://jsonplaceholder.typicode.com/comments?postId=${1}
*/

