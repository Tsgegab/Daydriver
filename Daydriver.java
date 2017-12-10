public class Daydriver {

 	public static void main(String [] args) {

 		Day presentday = new Day("Wednesday");

 		System.out.println(presentday.nextDay());

 		System.out.println(presentday.previousDay());

 		System.out.println(presentday.calculateDay(-1));

 	}

 }
