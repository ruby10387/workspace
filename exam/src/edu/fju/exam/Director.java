package edu.fju.exam;

public class Director extends Manager{
	int bonus;
	public Director(String name,int salary,int bonus){
		super(name,salary);
		this.bonus = bonus;
	}
	@Override
	public void print(){
		salary = salary+addition;
		System.out.println(name+"\t"+salary+"("+bonus+")");
	}
}
