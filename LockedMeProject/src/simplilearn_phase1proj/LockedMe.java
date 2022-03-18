package simplilearn_phase1proj;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockedMe {
	static Scanner scan = new Scanner(System.in);
	static final String filesPath="F:\\JavaClass\\Day9ProjectPhase1\\Files";
	/**
	 * 	This method display the menu
	 */
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
	/**
	 * This method retrieve  all the files
	 */
	public static void getAllFiles() {
		File file = new File(filesPath);
		File[] listOfFiles = file.listFiles();
		if(listOfFiles.length>0) {
			System.out.println("Below are the files");
		for(var l:listOfFiles) {
			System.out.println(l.getName());
		}
		}else {
			System.out.println("The mentioned Folder is an Empty");
		}
	}
	/**
	 * This method create the new file
	 */
	public static void addFiles() {
		try {
		String fileName;
		//Read the input from user
		System.out.println("Please Enter the file name");
		fileName=scan.nextLine();
		
		System.out.println("How may line want to write?");
		int lineCount = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter file content here");
		FileWriter fw = new FileWriter(filesPath + "\\" + fileName+".txt");
		
		//Read the line by line from user
		for(int i=0;i<lineCount;i++) {
			fw.write(scan.nextLine()+"\n");
		}
		System.out.println("File is created successfully");
		fw.close();
		
		}
		catch(Exception ex) {
			
		}
	}
	
	//added utility file for reference to make it dynamic
	/**
	 * This method check file is present in file folder
	 * @param fileName String
	 * @return boolean
	 */
	public static boolean chekFilesExists(String fileName) {
		
		ArrayList<String> allFiles = new ArrayList<String>();
		File folder = new File(filesPath);
		File[] listOfFiles = folder.listFiles();

	    if(listOfFiles.length>0) {
		   for(var l:listOfFiles) {
			allFiles.add(l.getName());
		   }
	    }
	    
	    return allFiles.contains(fileName);
	}
	
	/**
	 * This method search the file
	 */
	public static void searchFile() {
		
		try {
			System.out.println("Enter the file name to be Searched");
			String fileName = scan.nextLine();
			//To get all the files into the list
			ArrayList<String> allFiles = new ArrayList<String>();
			File folder = new File(filesPath);
			File[] listOfFiles = folder.listFiles();

		    if(listOfFiles.length>0) {
			   for(var l:listOfFiles) {
				allFiles.add(l.getName());
			   }
		    }
		    if(allFiles.contains(fileName+".txt")) {
				//System.out.println("File exit at "+folder.getAbsolutePath()+"\\"+fileName+".txt");
		    	System.out.println("File is available");
		    }else {
		    	System.out.println("file not found");
		    }  
		}
		catch(Exception ex) {}
	}
	
	public static void deleteFile() {
		File file = new File(filesPath);
		List<String> list = Arrays.asList(file.list());
		System.out.println("Enter name of file need to delete");
		
		try {
			String fileName = scan.nextLine()+".txt";
			if((list.contains(fileName))) {
				File filedelete = new File(filesPath+"\\"+fileName);
				filedelete.delete();
				System.out.println(filedelete.getName()+" is deleted successfully\n");
			}
			else
			{
				System.out.println("File does not Exists");
			}
		}
		catch(Exception ex) {
			System.out.println("Unable to download the. Please contact Admin");
		}
	}
}
