package com.assignment.department.main;

import com.assignment.department.ex.SuperDepartment;
import com.assignment.department.ex.AdminDepartment;
import com.assignment.department.ex.HrDepartment;
import com.assignment.department.ex.TechDepartment;

public class Main{
	public static void main(String[] args) {
		SuperDepartment sd = new SuperDepartment();
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment(); 
		ad.departmentName();
		ad.getTodaysWork();
		ad.getWorkDeadline();
		sd.isTodayAHoliday();
		System.out.println(System.lineSeparator());
		hd.departmentName();
		hd.doActivity();
		hd.getTodaysWork();
		hd.getWorkDeadline();
		sd.isTodayAHoliday();
		System.out.println(System.lineSeparator());
		td.departmentName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStackInformation();
		sd.isTodayAHoliday();
		}

}
