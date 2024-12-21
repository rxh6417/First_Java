import java.util.Scanner;


public class Main{
    public static void my_function( int people,
                                Double price,
                                Double tax,
                                Double tip){
        tax = tax * price;
        tip = tip * price;
        Double total = tax + tip + price;
        System.out.println("Total payment: "+total);
        Double pays = total/people;
        System.out.println("Each pays: "+ pays);
}
    
    public static void main(String[] args){
       
        System.out.println("How many people are eating in share?");
        Scanner people = new Scanner(System.in);
        int people1 = people.nextInt();
        System.out.println("Provide price, tax, and tip of the food");
        System.out.println("Price:-");
        Scanner price = new Scanner(System.in);
        Double price1 = price.nextDouble();
        System.out.println("tax:-");
        Double tax = price.nextDouble();
        System.out.println("Do you want to give tip? (yes/no)");
        Scanner input = new Scanner(System.in);
        String user = input.next();
        if(user.equals("yes")){
        System.out.println("tip:-");
        Double tip = price.nextDouble();
        my_function(people1,price1,tax,tip);
        }else if(user.equals("no")){
            Double tip = 0.000;
            my_function(people1,price1,tax,tip);
        }else{
            System.out.println("Invalid command");
            System.exit(0); 
        }
        
    }
}
