package com.employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_info")
public class Employee {
		@Id
		@GeneratedValue
		int id;
		String fname,mname,lname;
		String phone;
		String dpart;
		String quali;
		String salary;
		String manager;
		String JobTitle;
		String adharNo;
		String email;
		String gender;
		
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Employee(int id, String fname, String mname, String lname, String phone, String dpart, String quali,
				String salary, String manager, String jobTitle, String adharNo,String email,String gender) {
			super();
			this.id = id;
			this.fname = fname;
			this.mname = mname;
			this.lname = lname;
			this.phone = phone;
			this.dpart = dpart;
			this.quali = quali;
			this.salary = salary;
			this.manager = manager;
			this.JobTitle = jobTitle;
			this.adharNo = adharNo;
			this.email=email;
			this.gender=gender;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return fname;
		}
		public void setName(String name) {
			this.fname = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getDpart() {
			return dpart;
		}
		public void setDpart(String dpart) {
			this.dpart = dpart;
		}
		public String getQuali() {
			return quali;
		}
		public void setQuali(String quali) {
			this.quali = quali;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getManager() {
			return manager;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		public String getJobTitle() {
			return JobTitle;
		}
		public void setJobTitle(String jobTitle) {
			JobTitle = jobTitle;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getMname() {
			return mname;
		}

		public void setMname(String mname) {
			this.mname = mname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getAdharNo() {
			return adharNo;
		}

		public void setAdharNo(String adharNo) {
			this.adharNo = adharNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", phone="
					+ phone + ", dpart=" + dpart + ", quali=" + quali + ", salary=" + salary + ", manager=" + manager
					+ ", JobTitle=" + JobTitle + ", adharNo=" + adharNo + ", email=" + email + ", gender=" + gender
					+ "]";
		}
		
		
		
		
		
		
}
