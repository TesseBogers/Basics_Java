public class Person {
    // state of an object
    int age;
    String name;

    // behavior of an object
    public void set_value() {
        age = 20;
        name = "Robin";
    }
    public void get_value() {
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }

    // main method
    public static void main(String [] args) {
        // creates a new Person object
        Person p = new Person();

        // changes state through behavior
        p.set_value();
        p.get_value();
    }
}

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        } else if (number % 5 == 0 ) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println(number);
//        }
//
//
//        final byte MONTHS_IN_YEARS = 12;
//        final byte PERCENT = 100;
//        int principal;
//        float monthlyInterest;
//        int numberOfPayments;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Principal (1000-1,000,000: ");
//            principal = scanner.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter a value between 1000 and 1000000");
//        }
//
//        while (true) {
//            System.out.print("Annual interest rate (1-30: ");
//            float annualInterest = scanner.nextFloat();
//            if (annualInterest >= 1 && annualInterest <= 30){
//                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//        }
//
//        while (true){
//            System.out.print("Period (years: 1-30): ");
//            byte years = scanner.nextByte();
//            if (years >= 1 && years <= 30){
//                numberOfPayments = years * MONTHS_IN_YEARS;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//        }
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);
//        }
//}
