package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[]nums = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i=0; i<nums.length; i++) {
	nums[i]=new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
nums[0].setX(0);
nums[0].setY(500);
nums[1].setX(100); 
nums[1].setY(500);
nums[2].setX(200);
nums[2].setY(500);
nums[3].setX(300);
nums[3].setY(500);
nums[4].setX(400);
nums[4].setY(500);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.


	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.


	
while(true) {
	Random rand = new Random();
	for (int i = 0; i < nums.length; i++) {
		int t=rand.nextInt(10);
		nums[i].move(t);
		nums[i].turn(10);
	}
	
	for(int i=0; i<nums.length; i++) {
	
	if(nums[i].getY()>500) {
		System.out.println("they won");
		return;
	}
}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
}
