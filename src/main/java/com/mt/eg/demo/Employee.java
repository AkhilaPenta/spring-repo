package com.mt.eg.demo;

public class Employee {
		 private int id;
		 private String name;
		 private double salary;
		 public Employee(int id,String name,double salary) {
			 super();
			 this.id=id;
			 this.name=name;
			 this.salary=salary;
		 }
		public int getId() {
			return id;
		}
		public void setId(int Id) {
			this.id= Id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public double getsalary() {
			return salary;
		}
		public void setTotalclgs(double salary) {
			this.salary=salary;
		}
		public String toString() {
			return "Employee[id="+id+",name="+name+",salary="+salary+"]";
		}
		}