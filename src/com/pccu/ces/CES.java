package com.pccu.ces;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CES {
	
	static ArrayList<Student> list = null;
	
	private static void WriteFile (ArrayList<Student> list, String filepath) {
		
		FileWriter f = null;
		
		try {
			f = new FileWriter(filepath);
			
			Iterator<Student> it = new Iterator<Student>(list);
			while(it.hasNext()) {
				
				Student s = it.next();
				
				f.write("ID: " + s.getId() + " " +
						"Name: " + s.getName() + " " +
						"Chinese: " + s.getChi() + " " +
						"English: " + s.getEng() + " " +
						"Mathematics: " + s.getMath() + " " +
						"Average: " + s.getAvg()
						);
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			f.close();
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
