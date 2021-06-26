package com.employee.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.employee.entity.Employee;
//import com.employee.repository.EmployeeRepository;

@SpringBootApplication(scanBasePackages = {"com.employee.controller","com.employee.entity","com.employee.repository","com.employee.service","com.employee.service.impl"})
@ComponentScan(basePackages = {"com.employee.controller","com.employee.entity","com.employee.repository","com.employee.service","com.employee.service.impl"})

@EnableJpaRepositories("com.employee.repository")
@EntityScan("com.employee.entity")
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	
	//@Autowired
	//private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception
	
	{
		/*Employee employee1 = new Employee("Vikram","Kumar","vikram@gmail.com");
		employeeRepository.save(employee1);
		
		Employee employee2 = new Employee("Ashok","Varma","Ashok@gmail.com");
		employeeRepository.save(employee2);
		
		Employee employee3 = new Employee("Ravi","Kiran","kiran@gmail.com");
		employeeRepository.save(employee3); */
	}

}
