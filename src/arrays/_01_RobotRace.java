package arrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[]nums = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i=0; i<5; i++) {
	nums[i]=new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
nums[0].setX(0);
nums[0].setY(0);
nums[1].setX(10); 
nums[1].setY(0);
nums[2].setX(20);
nums[2].setY(0);
nums[3].setX(30);
nums[3].setY(0);
nums[4].setX(40);
nums[4].setY(0);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
