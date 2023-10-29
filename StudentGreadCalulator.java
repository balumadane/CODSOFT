import java.util.Scanner;
public class StudentGreadCalulator {
	private static void greade() { 
		String choice;
		do {
			System.out.println("****CodSoft  :: Task 2****");
			System.out.println("...  Student Gread Calculator  ...");
			System.out.println("");
			System.out.println("ENTER YOUR SUBJECT_1 MARKS OF OUT OF 100");
			Scanner sc = new Scanner(System.in);
			float sub1=sc.nextFloat(); 
			System.out.println("ENTER YOUR SUBJECT_2 MARKS OF OUT OF 100");
			float sub2=sc.nextFloat();
			System.out.println("ENTER YOUR SUBJECT_3 MARKS OF OUT OF 100");
			float sub3=sc.nextFloat();
			System.out.println("ENTER YOUR SUBJECT_4 MARKS OF OUT OF 100");
			float sub4=sc.nextFloat();
			System.out.println("ENTER YOUR SUBJECT_5 MARKS OF OUT OF 100");
			float sub5=sc.nextFloat();
			System.out.println("ENTER YOUR SUBJECT_6 MARKS OF OUT OF 100");
			float sub6=sc.nextFloat();
			System.out.println("");
			float total=sub1+sub2+sub3+sub4+sub5+sub6;
			System.out.println("YOUR OBTAINED MARKS OUT OF 600 IS:"+""+total+"/600");
			float per =(total / 600)*100;
			System.out.println("your percentage is:"+""+per+"%");
			System.out.println("");
			if(per>=90 && per<=100){
				System.out.println("your gread is: "+"A+");
			}
			else if(per>=80 && per<=90){
				System.out.println("your gread is: "+"A");
			}
			else if(per>=60 && per<=80){
				System.out.println("your gread is: "+"B");
			}
			else if(per>=45 && per<=60){
				System.out.println("your gread is: "+"C");
			}
			else if(per>=35 && per<=45){
				System.out.println("your gread is: "+"D");
			}
			else{
				System.out.println("YOU ARE FAIL..TRY AGAIN NEXT YEAR WITH PROPER STUDY");
			}
			System.out.println("want to calculate another student result(y/n)?");
			choice = sc.next();
		}
		 while (choice.equalsIgnoreCase("y"));
		System.out.println("!!Good Luck For Your Next Year!!");
	}
	public static void main(String[] args) {
			greade();
	}
}
