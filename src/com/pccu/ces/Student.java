package com.pccu.ces;

public class Student implements IPeople {
	
	private int id, chi, eng, math;
	private float avg;
	private String name;
	
	@Override
	public void setId(int id) { this.id = id; }
	
	@Override
	public int getId() { return this.id; }
	
	@Override
	public void setName(String name) { this.name = name; }
	
	@Override
	public String getName() { return this.name; }
	
	public void setChi(int score) { this.chi = score; }
	public void setEng(int score) { this.eng = score; }
	public void setMath(int score) { this.math = score; }
	public int getChi() { return this.chi; }
	public int getEng() { return this.eng; }
	public int getMath() { return this.math; }
	
	public void calAvg() { this.avg = (chi + eng + math)/3; }
	public float getAvg() { return this.avg; }
	
}
