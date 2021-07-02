import java.sql.SQLOutput;
import java.util.Scanner;
public class Owner {

    public static void main(String[] args) {
      int totalIncome;
      int currentIncome = 0;
      int numberSeat = 0;
      float percentage = 0;
      int select;
      select = 0;
      int numberOfPurchasedTicket;
      numberOfPurchasedTicket = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of rows:");
      int rows = input.nextInt();
      System.out.println("Enter the number of seats in each row:");
      int column= input.nextInt();
      char[][] totalNumberOfSeat = new char[rows][column];
      for (int i = 0; i < rows; i++) {
        for (int k = 0; k < column; k++) {
          totalNumberOfSeat[i][k] = 'S';
          //System.out.print(totalNumberOfSeat[i][k] + "  ");
        }
        //System.out.println();

      }
      int numberOfRemainingSeat=rows*column;
      int ticketPrice = 10;
      do {

        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println("kindly check our menu:");
        System.out.println("1 to Show the seats");
        System.out.println("2 to Buy a ticket");
        System.out.println("3 for Statistics");
        System.out.println("0 to Exit");
        System.out.println("choose whatever you want to do:");
        totalIncome = rows * column;
        select = input.nextInt();
        if (select == 1){
          for (int i = 0; i < rows; i++) {
            for (int k = 0; k < column; k++) {
              //totalNumberOfSeat[i][k] = 'd';
              System.out.print(totalNumberOfSeat[i][k] + "  ");
            }
            System.out.println();
          }

        }else if(select ==2){
          System.out.println("enter number of rows ");
          int chooseRow= input.nextInt();
          System.out.println("enter seat number on row ");
          int chooseColumn =input.nextInt();
          if(totalNumberOfSeat[chooseRow-1][chooseColumn-1] != 'B'){
            totalNumberOfSeat[chooseRow-1][chooseColumn-1] = 'B';
            System.out.println("seat booked successfully");
            numberOfPurchasedTicket++;
            numberOfRemainingSeat--;
          }else{
            System.out.println(" chosen seat, seat has been booked");

          }

        }else if(select == 3){
          System.out.println("Purchased Ticket: " + numberOfPurchasedTicket);
          totalIncome=column*rows*ticketPrice;
          System.out.println("Total income: " + totalIncome);
          percentage=(currentIncome*100)/totalIncome;
          System.out.println("Percentage: " + percentage);
          currentIncome= numberOfPurchasedTicket*ticketPrice;
          System.out.println("current income: " + currentIncome);
          System.out.println("The remaining seat: " + numberOfRemainingSeat);
        }

      }while (select != 0);





      }

}
