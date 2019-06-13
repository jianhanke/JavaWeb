package cn.itcast.chapter08.javabean;

import java.util.Date;

public class Manager2 extends Employee{

	private double bonus=500.0;
	private Date birthday;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
