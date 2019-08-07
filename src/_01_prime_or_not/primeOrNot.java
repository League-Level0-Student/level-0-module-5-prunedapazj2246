package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num=JOptionPane.showInputDialog("Enter a number!!");
int number = Integer.parseInt(num);
for (int i = 2; i <= number; i++) {
	if(number % i == 0) {
	JOptionPane.showMessageDialog(null, "You do not have a prime number!");	
	}else {
		JOptionPane.showMessageDialog(null, "You have a prime number!");
	}
}
	}

}
