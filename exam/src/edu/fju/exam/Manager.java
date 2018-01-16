package edu.fju.exam;

public class Manager extends Employee{
	int addition = 5000;
	public Manager(String name,int salary){
		super(name,salary);
	}
	@Override
	public void print(){
		salary = salary+addition;
		System.out.println(name+"\t"+salary);
	}
	
}
