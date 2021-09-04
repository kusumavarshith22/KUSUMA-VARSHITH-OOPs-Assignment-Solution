import java.io.*;
import java.util.*;

class SuperDepartment{
	public String departmentName(){
		String sd = "departmentName";
		return sd;
	}
	
	public String getTodaysWork(){
		String tdyWork = "No Work as of now";
		return tdyWork;
	}
	
	public String getWorkDeadline(){
		String workDdln = "";
		return workDdln;
	}
	
	public String isTodayAHoliday(){
		String ans = "Today is not a holiday";
		return ans;
	}
}

class AdminDepartment extends SuperDepartment{
	public String departmentName(){
		String ad = "Admin Department";
		return ad;
	}
	
	public String getTodaysWork(){
		String tdyWork = "Complete your documents Submission";
		return tdyWork;
	}
	
	public String getWorkDeadline(){
		String workDdln = "Complete by EOD";
		return workDdln;
	}
	
}

class HrDepartment extends SuperDepartment{
	public String departmentName(){
		String sd = "Hr Department";
		return sd;
	}
	
	public String getTodaysWork(){
		String tdyWork = "Fill today's timesheet and mark your attendance";
		return tdyWork;
	}
	
	public String getWorkDeadline(){
		String workDdln = "Complete by EOD";
		return workDdln;
	}
	
	public String doActivity(){
		String ans = "team Lunch";
		return ans;
	}
}

class TechDepartment extends SuperDepartment{
	public String departmentName(){
		String sd = "Tech Department";
		return sd;
	}
	
	public String getTodaysWork(){
		String tdyWork = "Complete coding of Module 1";
		return tdyWork;
	}
	
	public String getWorkDeadline(){
		String workDdln = "Complete by EOD";
		return workDdln;
	}
	
	public String getTechStackInformation(){
		String ans = "core Java";
		return ans;
	}
}

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment td = new TechDepartment();
		
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to "+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		
		
	}
}

