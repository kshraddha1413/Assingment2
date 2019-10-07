
public class FooCorporation {

	public static void main(String[] args) {
		double EmpPay1=totalPay(7.50,35);
		System.out.println("Employee1 payment:"+EmpPay1);
		double EmpPay2=totalPay(8.20,47);
		System.out.println("Employee2 payment:"+EmpPay2);
		double EmpPay3=totalPay(10.00,73);
		System.out.println("Employee3 payment:"+EmpPay3);		
	}  
	
	public static double totalPay(double basePay,double hoursWorked){
 	   double totalPayment=0;
 	   if(basePay<8){
 		  System.err.println("BasePay is lessthen $8.00 an hour");
 	   }
 	   if (hoursWorked>60) {
 		   System.err.println("number of hours greaterthen 60");
 	   }
 	  if(hoursWorked<=40) {
 		   totalPayment=basePay*hoursWorked;
 		   return totalPayment;
 	 }else{
 		   double extraHours=hoursWorked-40;
 		   totalPayment=(basePay*hoursWorked)+extraHours*basePay*1.5;
 		   return totalPayment;
 	 }
 	  
}
}