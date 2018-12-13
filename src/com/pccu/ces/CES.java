package com.pccu.ces;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CES {
	
	static ArrayList<Student> list = null;
	
	private static void WriteFile (ArrayList<Student> list, String filepath) {
		
		FileWriter f = null;
		
		try {
			f = new FileWriter(filepath);
			
			for (Student it: list) {
				Student s = it;
				
				f.write("ID: " + s.getId() + " " +
						"Name: " + s.getName() + " " +
						"Chinese: " + s.getChi() + " " +
						"English: " + s.getEng() + " " +
						"Mathematics: " + s.getMath() + " " +
						"Average: " + s.getAvg() + "\n"
						);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try { f.close(); }
			catch (IOException e) { e.printStackTrace(); }
			System.out.println("Complete.");
		}
		
	}
	
	@SuppressWarnings("resource")
	private static void ScoreEnrollment() {
		
		for (int i=0; i<3; i++) {
			
			Student s = new Student();
			
			System.out.printf("Enter ID: ");
			s.setId(new Scanner(System.in).nextInt());
			
			System.out.printf("Enter name: ");
			s.setName(new Scanner(System.in).nextLine());
			
			System.out.printf("Enter Chinese score: ");
			s.setChi(new Scanner(System.in).nextInt());
			
			System.out.printf("Enter English score: ");
			s.setEng(new Scanner(System.in).nextInt());
			
			System.out.printf("Enter Mathematics score: ");
			s.setMath(new Scanner(System.in).nextInt());
			
			s.calAvg();
			
			list.add(s);
			
		}
		
		WriteFile(list, "src/score.txt");
		
	}

	public static void main(String[] args) {
		
		list = new ArrayList<Student>();
		
		ScoreEnrollment();

	}

}
