import java.util.ArrayList;
import java.util.Scanner;
public class Bank
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        // list.add(new Person("Aman Mujawar","pune",10000));
        // list.add(new Person("Ayan Mujawar","pune",10000));
        // list.add(new Person("Saniya Mujawar","pune",10000));
        int ch;
        do{
            System.out.println("\t\t\t----------------------------------------");
            System.out.println("\t\t\t\tBank of Maharashtra ");
            System.out.println("\t\t\t----------------------------------------");
            System.out.println("1.Create Account");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Balance Info");
            System.out.println("5.List of All Account");
            System.out.println("6.Exit");
            System.out.println("Select Above Operations = ");

            ch = sc.nextInt();
            String name,city;
            double amt;
            int accno;
            switch(ch)
            {
            case 1:
                System.out.println("-------- Creating Account ---------");
                System.out.print("Enter Name: ");
                name=sc.next();
                System.out.print("Enter city: ");
                city=sc.next();
                System.out.print("Enter Ammount: ");
                amt=sc.nextDouble();
                Person p = new Person(name, city, amt);
                list.add(p);
                System.out.println("Account Opened...!");
                break;
            case 2:
                System.out.println("-------- Deposite Ammount ----------");
                System.out.print("Enter Account Number = ");
                accno=sc.nextInt();
                for(Person p1 : list) {
                    if(accno==p1.getAccount_no()) {
                        System.out.println("Account holder found...!");
                        System.out.println("Account Holder's name = "+p1.getName());
                        System.out.println("City = "+p1.getCity());
                        System.out.println("Account Balance = "+p1.getBal());
                        System.out.print("\nEnter Ammount to deposit = ");
                        amt=sc.nextDouble();
                        p1.setBal(p1.getBal()+amt);
                        System.out.println("Deposite successfully..!");
                    } else {
                        System.out.println("Account number not present ?");

                    }
                }
                break;
            case 3:
                System.out.println("-------- Withdraw Ammount ---------");
                System.out.print("Enter Account Number = ");
                accno=sc.nextInt();
                for(Person p1 : list) {
                    if(accno==p1.getAccount_no()) {
                        System.out.println("Account holder found...!");
                        System.out.println("Account Holder's name = "+p1.getName());
                        System.out.println("City = "+p1.getCity());
                        System.out.println("Account Balance = "+p1.getBal());
                        System.out.print("\nEnter Ammount to deposit");
                        amt=sc.nextDouble();
                        if(amt<=p1.getBal()) {
                            p1.setBal(p1.getBal()-amt);
                            System.out.println("Withdrwal successfully..!");
                        } else {
                            System.out.println("Insufisiant Balance");
                        }

                    } else {
                        System.out.println("Account number not present ?");

                    }
                }
                break;
            case 4:
                System.out.println("-------- Balance Information ---------");
                System.out.print("Enter Account Number = ");
                accno=sc.nextInt();
                for(Person p1 : list) {
                    if(accno==p1.getAccount_no()) {
                        System.out.println("Account holder found...!");
                        System.out.println("Account Holder's name = "+p1.getName());
                        System.out.println("Balance = "+p1.getBal());
                    } else {
                        System.out.println("Account not Avilable");
                    }
                }
                break;
            case 5:
                System.out.println("-------- List of All Accounts ---------");
                System.out.println("[List of all Account Holders]");
                System.out.println(list);
                System.out.println(" ");
                break;
            case 6:
                System.out.println("-------- Thank for visiting (^ . ^) ---------");
                break;
            default:
                System.out.println("-------- Account Created ---------");
                break;
            }
        } while(ch!=6);

        // for(Person p:list){
        //     System.out.println(p);
        // }
    }

}