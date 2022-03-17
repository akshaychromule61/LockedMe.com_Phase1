package simplilearn_phase1proj;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {
	static final String filesPath="F:\\JavaClass\\Day9ProjectPhase1\\Files";

	public static void displayMenu() {
		System.out.println("********************************************");
		System.out.println("\tWelcome to LockedMe.com Secure App");
		System.out.println("\tDeveloped by: Akshaykumar Chormule");
		System.out.println("********************************************");
		System.out.println("\t\t1. Display all files");
		System.out.println("\t\t2. Add new files");
		System.out.println("\t\t3. Delete a file");
		System.out.println("\t\t4. Search file");
		System.out.println("\t\t5. Exit");
		System.out.println("********************************************");

	}
	public static void getAllFiles() {
		File file = new File(filesPath);
		File[] listOfFiles = file.listFiles();
		if(listOfFiles.length>0) {
			System.out.println("Below are the files");
		for(var l:listOfFiles) {
			System.out.println(l.getName());
		}
		}else {
			System.out.println("The mentioned Folder in an Empty");
		}
	
	}
	
	public static void addFiles() {
		try {
		Scanner scan = new Scanner(System.in);
		String fileName;
		System.out.println("Please Enter the file name");
		fileName=scan.nextLine();
		
		System.out.println("How may line want to write?");
		int lineCount = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter file content here");
		FileWriter fw = new FileWriter(filesPath + "\\" + fileName+".txt");
		
		//Read the lies from user
		for(int i=0;i<lineCount;i++) {
			fw.write(scan.nextLine()+"\n");
		}
		System.out.println("File is created successfully");
		fw.close();
		
		}
		catch(Exception ex) {
			
		}
		
	}
	
	public static void searchFile() {}
	
	public static void deleteFile() {}
	
	
	

}
