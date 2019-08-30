import java.util.Random;

import javax.swing.JOptionPane;

public class skillPracticeWorksheet {
public static void main(String[] args) {

skillPracticeWorksheet skills = new skillPracticeWorksheet();
          	//skills.skill1();
          	//skills.skill2();
          	//skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");// Use pop-ups for the following.
// Ask the user how many dimes they have
int pennies = Integer.parseInt(dimes);
pennies*=10;
JOptionPane.showMessageDialog(null, "You have "+ pennies +" pennies");

// Tell them how many cents they have (hint multiply by 10)




String tall =JOptionPane.showInputDialog("How tall are you?(in inches)");// Ask the user how tall they are (inches)
int height = Integer.parseInt(tall);
if(height<36) {
	JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIES!!");
}


// If they are shorter than 36 inches, tell them to eat their Wheaties




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 1; i < 30; i++) {
if(i%3==0) {
	System.out.println(i);
}
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random rand = new Random();
int num = rand.nextInt(20);
System.out.println(num);
int number = rand.nextInt(10);
System.out.println(number);
// Get another random number that is less than 10 and print it to the console 
int difference = num-number;
JOptionPane.showMessageDialog(null, "The difference between the numbers is "+difference);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city =JOptionPane.showInputDialog("What city do you live in?");


if(city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in Aerica's Finest City!");
}
// If they answered "San Diego", tell them they live in America's Finest City 

else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego.");
}

// Otherwise, tell them to move to San Diego 
int cars = 3;

if(cars==0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
else if(cars==1) {
	JOptionPane.showMessageDialog(null, "Bougatti, Chiron Model");
}
else {
	cars*=4;
	JOptionPane.showMessageDialog(null, "You have " + cars + " wheels on all your cars");
}
// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 

String school=JOptionPane.showInputDialog("What is the name of you school?");

JOptionPane.showMessageDialog(null,  school + " is amazing");// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



}
}
