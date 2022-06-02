package replit;
import java.util.Scanner; 
public class SwitchInstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Scanner scan=new Scanner(System.in);
				String instructor, assignment;
				System.out.println("Enter the name of the instructor");
				instructor=scan.nextLine();
				
				switch(instructor) {
				case "Asghar":
					assignment="Java";
					break;
				case "Moazzam":
					assignment="SDLC";
					break;
				case "Weqas":
					assignment="Selenium";
					break;
				case "Asel":
					assignment="every";
					break;
					default:
						assignment="none";
		        System.out.println("Invalid instructor selected");
			}
				System.out.println("Will take care of "+assignment+" Assignment");

			}
		


	}


