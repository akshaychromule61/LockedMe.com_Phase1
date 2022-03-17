package simplilearn_phase1proj;

import java.util.Scanner;

final class ClientApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		do {
		LockedMe.displayMenu();
		System.out.println("Enter your Choise");
		choice = Integer.parseInt(scan.nextLine());
		
		switch(choice) {
		case 1: LockedMe.getAllFiles();
				break;
		case 2: LockedMe.addFiles();
				break;
		case 3: LockedMe.deleteFile();
				break;
		case 4: LockedMe.searchFile();
				break;
		case 5: System.exit(0);
				break;
		default: System.out.println("You Entered Invalid Input");
				break;
				
		}
		}while(choice>0);
		
		scan.nextLine();
		scan.close();
	}

}
