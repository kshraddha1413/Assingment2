
public class FooCorporation {

	public static void main(String[] args) {
		double Emp1 = totalPay(7.50, 35);
		System.out.println("base pay : 7.50 hours worked: 35" + "Employee1 payment:" + Emp1);
		double Emp2 = totalPay(8.20, 47);
		System.out.println("base pay : 8.20 hours worked: 47" + "Employee2 payment:" + Emp2);
		double Emp3 = totalPay(10.00, 73);
		System.out.println("base pay : 10.00 hours worked: 73" + "Employee3 payment:" + Emp3);
	}

	public static double totalPay(double basePay, double hoursWorked) {
		double totalPayment = 0;

		if ((basePay < 8.00) || (hoursWorked > 60)) {
			System.err.println("base pay :" + basePay + "hours worked: " + hoursWorked
					+ " Either BasePay is less than $8.00 or hours are more than 60");
		} else {
			if (hoursWorked <= 40) {
				totalPayment = basePay * hoursWorked;
				
			} else {
				double extraHours = hoursWorked - 40;
				totalPayment = (basePay * hoursWorked) + extraHours * basePay * 1.5;
				
			}
		}return totalPayment;

	}

}