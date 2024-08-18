package week3.day2;

public class Amazon extends CanaraBank {
	   public void cashOnDelivery() {
	      System.out.println("Cash on Delivery");
	   }

	   public void upiPayment() {
	      System.out.println("UPI Payments Accepted");
	   }

	   public void cardPayments() {
	      System.out.println("Card Payments allowed");
	   }

	   public void internetBanking() {
	      System.out.println("Internet Banking allowed");
	   }

	   public static void main(String[] args) {
	      Amazon a = new Amazon();
	      a.cardPayments();
	      a.cashOnDelivery();
	      a.internetBanking();
	      a.upiPayment();
	   }
	}