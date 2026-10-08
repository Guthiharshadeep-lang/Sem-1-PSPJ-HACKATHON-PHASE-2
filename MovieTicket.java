import java.util.Scanner;
public class MovieTicket{
    String movieName;
    int ticketprice;
    int numberOfTickets;
    MovieTicket(String movieName,int ticketprice,int numberOfTickets){
        this.movieName=movieName;
        this.ticketprice=ticketprice;
        this.numberOfTickets=numberOfTickets;
    }
    int calculateTotal(){
        return ticketprice*numberOfTickets;
    }
    double calculateDiscount(){
        if(numberOfTickets>=5){
            return 0.1 * calculateTotal();
        }
        return 0.0;
    }
    double calculateFinalAmount(){
        return calculateTotal()-calculateDiscount();
    }
    void displayBill(){
        System.out.println("movie name:"+movieName);
        System.out.println("Ticket price:"+ticketprice);
        System.out.println("number of tickets booked:"+numberOfTickets);
        System.out.println("discount:"+calculateDiscount());
        System.out.println("final amount:"+calculateFinalAmount());
      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of movie");
        String movieName = sc.nextLine();
        System.out.println("enter the ticket price");
        int ticketprice = sc.nextInt();
        System.out.println("enter the number of tickets");
        int numberOfTickets=sc.nextInt();

        MovieTicket m = new MovieTicket(movieName,ticketprice,numberOfTickets);

        m.displayBill();

    }
}