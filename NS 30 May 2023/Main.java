// Encapsulation - Example1
// class Person
// {
//      String name;
// }

// class Main
// {
//     public static void main(String args[])
//     {
//         Person p = new Person();
//         p.name = "Darshan";
//         System.out.println("Name: "+p.name);
//     }
// }

// // Encapsulation - Example2
// class Person
// {
//     private String name;

//     void setName(String name)
//     {
//         this.name = name;
//     }

//     String getName()
//     {
//         return name;
//     }
// }

// class Main
// {
//     public static void main(String args[])
//     {
//         Person p = new Person();
//         p.setName("Darshan");
//         System.out.println("Name: "+p.getName());
//     }
// }



// Encapsulation - Example3
// Bank Example
class BankAccount
{
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    void setaccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance)
    {
        this.balance = balance;
    }

    void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    void setEmail(String email)
    {
        this.email = email;
    }

    void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    String getAccountNumber()
    {
        return accountNumber;
    }

    double getBalance()
    {
        return balance;
    }

    String getCustomerName()
    {
        return customerName;
    }

    String getEmail()
    {
        return email;
    }
    String getPhoneNumber()
    {
        return phoneNumber;
    }

    void deposit(double amount)
    {
        balance = balance+amount;
        System.out.println("Deposited "+amount+" into the account. New balance: "+balance);
    }

    void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = balance-amount;
            System.out.println("Withdrawn "+amount+" from the account. New balance: "+balance);
        }
        else
        {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        BankAccount customer1 = new BankAccount();
        BankAccount customer2 = new BankAccount();

        customer1.setCustomerName("Arunangshu");
        customer1.setBalance(5000000);
        customer1.setEmail("mullick420@gmail.com");
        customer1.setPhoneNumber("9007887910");
        customer1.setaccountNumber("1012354");

        customer2.setCustomerName("Darshan");
        customer2.setBalance(500);
        customer2.setEmail("ingledarsh@gmail.com");
        customer2.setPhoneNumber("8007887912");
        customer2.setaccountNumber("11223221");

        System.out.println("Customer1 Details:");
        System.out.println("Name: "+customer1.getCustomerName());
        System.out.println("Account Number: "+customer1.getAccountNumber());
        System.out.println("Email: "+customer1.getEmail());
        System.out.println("Contact: "+customer1.getPhoneNumber());
        System.out.println("Paisa: "+customer1.getBalance());

        System.out.println("\nCustomer2 Details:");
        System.out.println("Name: "+customer2.getCustomerName());
        System.out.println("Account Number: "+customer2.getAccountNumber());
        System.out.println("Email: "+customer2.getEmail());
        System.out.println("Contact: "+customer2.getPhoneNumber());
        System.out.println("Paisa: "+customer2.getBalance());

        System.out.println();
        customer1.deposit(1500000);
        customer2.deposit(50);

        System.out.println();
        customer1.withdraw(200000);
        customer2.withdraw(10);
    }
}

// https://my.newtonschool.co/playground/code/v7svwzsgn27k
class Student {
	// your class code goes here
	String name;
	int rollNumber;


public void myFunction (String name, int rollNumber){
	// your function code goes here
	this.name = name;
	this.rollNumber = rollNumber;
}
}

// https://my.newtonschool.co/playground/code/jex7dadj8dg2
/*
class Car1{
    public String carName;
    public int modelNum, engineNum;

}
*/
// Your code here
Car1 carObj = new Car1();
carObj.carName = carName;
carObj.modelNum = modelNum;
carObj.engineNum = engineNum;