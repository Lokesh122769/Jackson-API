package com.SpringRest.JacksonApiRest2.Model;

public class Employee
{
    private Integer id;
    
    private String name;
    
    
    private Domain domain;
    
    private double salary;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Domain domain, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", domain=" + domain + ", salary=" + salary + "]";
	}
    
    
    
}
