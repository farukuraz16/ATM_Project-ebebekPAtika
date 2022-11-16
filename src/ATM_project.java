import java.util.Scanner;

public class ATM_project {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        String username, password;
        int balance = 1500, countTry = 3;//assigned balance and try count..
        String user = "patika";//assigned
        String pass = "ebebek";//assigned
        System.out.println("***** Welcome *****\n");
        while (countTry > 0) {//while loop for try username&password
            System.out.print("username= ");//ask user
            username = dat.nextLine();
            System.out.print("password= ");//ask user
            password = dat.nextLine();

            if (username.equals(user) && password.equals(pass)) {//check entry

                boolean flag = true;//control for wrong entry
                while (flag) {
                    System.out.print("\nMain Menu" +
                            "\nBalance ---> -1-" +
                            "\nDeposit ---> -2-" +
                            "\nWithdraw---> -3-" +
                            "\nExit    ---> -4-" +
                            "\nYour choice= ");
                    int option = dat.nextInt();//user choice
                    switch (option) {//swift case
                        case 1://monitor balance
                            System.out.println("Balance= $" + balance);
                            break;
                        case 2://deposit money
                            System.out.print("Amount of deposit= ");
                            int deposit = dat.nextInt();
                            System.out.println("The amount of deposit is $" + deposit +
                                    "\nYes -1- " +
                                    "\nNo  -2- \nYour choice?=");
                            int appr = dat.nextInt();
                            if (appr == 1) {//condition if user sure or not
                                balance += deposit;
                                System.out.println("Completed!" + "\nNew balance= $" + balance);
                            } else System.out.println("Canceled!");
                            break;
                        case 3://withdraw money
                            System.out.print("Amount of withdraw= ");
                            int withd = dat.nextInt();
                            if (withd <= balance) {
                                System.out.println("Your amount is $" + withd + "\nYes -1- \nNo -2-)");
                                appr = dat.nextInt();
                                if (appr == 1) {//condition if user sure or not
                                    System.out.println("Please get your money and do not forget to debit card." +
                                            "\nNew balance= $" + (balance - withd));
                                } else System.out.println("Canceled!");
                            } else System.out.println("Insufficient balance!");
                            break;
                        case 4://exit
                            flag = false;
                            System.out.print("Your process was canceled! \nHave a great day!");
                            break;
                        default:
                            System.out.print("Have a great day!");
                            }
                }break;//if user wants to exit

            } else {
                countTry -= 1;
                System.out.println("Username or password is incorrect!");
                if (countTry > 1) {
                    System.out.println("You can try " + countTry + " more times.");
                } else if (countTry == 1) {
                    System.out.println("Your last chance! Otherwise, your account will be blocked!");

                }
                if (countTry == 0) {//wrong username&password result
                    System.out.println("Your account has been blocked!");
                    break;
                }
                System.out.println("Please try again...");
            }

//break;

        }


    }
}














