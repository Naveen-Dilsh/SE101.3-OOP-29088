3.//using for loop
public class ForLoopExample {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 System.out.println("Executing Loop " + i);
 }
 }
}
//using while loop
public class WhileLoopExample {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println("Executing Loop " + i);
 i++;
 }
 }
}
4. public class LoopExample {
 public static void main(String[] args) {
 int[] numbers = {10, 20, 30, 40, 50};
 for (int x : numbers) {
 if (x == 30) {
 break;
 }
 System.out.println(x);
 }
 System.out.println("I'm out of the Loop now");
 }
}
//output
10
20
I'm out of the Loop now
//Using continue instead of break.
public class LoopExampleWithContinue {
 public static void main(String[] args) {
 int[] numbers = {10, 20, 30, 40, 50};
 for (int x : numbers) {
 if (x == 30) {
 continue;
 }
 System.out.println(x);
 }
 System.out.println("I'm out of the Loop now");
 }
}
Output
10
20
40
50
I'm out of the Loop now
5. public class GradeSwitchExample {
 public static void main(String[] args) {
 char grade = 'A';
 switch (grade) {
 case 'A':
 System.out.println("Excellent!");
 break;
 case 'D':
 System.out.println("You passed");
 case 'F':
 System.out.println("Better try again");
 break;
 default:
 System.out.println("Invalid grade");
 }
 System.out.println("Your grade is " + grade);
 }
}
Output
Excellent!
Your grade is A
//removing the "break" command at line number 6
public class GradeSwitchExampleWithoutBreak {
 public static void main(String[] args) {
 char grade = 'A';
 switch (grade) {
 case 'A':
 System.out.println("Excellent!");
 case 'D':
 System.out.println("You passed");
 case 'F':
 System.out.println("Better try again");
 default:
 System.out.println("Invalid grade");
 }
 System.out.println("Your grade is " + grade);
 }
}
Output
Excellent!
You passed
Better try again
Invalid grade
Your grade is A
using if-else-if statement instead of switch-case:
public class GradeIfElseIfExample {
 public static void main(String[] args) {
 char grade = 'A';
 if (grade == 'A') {
 System.out.println("Excellent!");
 } else if (grade == 'D') {
 System.out.println("You passed");
 } else if (grade == 'F') {
 System.out.println("Better try again");
 } else {
 System.out.println("Invalid grade");
 }
 System.out.println("Your grade is " + grade);
 }
}
Output
Excellent!
Your grade is A
6. class TestEnhancedForLoop {
 public static void main(String args[]) {
 int[] numbers = {10, 20, 30, 40, 50};
 for (int x : numbers) {
 System.out.print(x);
 System.out.print(",");
 }
 System.out.print("\n");
 String[] names = {"James", "Larry", "Tom", "Lacy"};
 for (String name : names) {
 System.out.print(name);
 System.out.print(",");
 }
 }
}
Output
10,20,30,40,50,
James,Larry,Tom,Lacy,