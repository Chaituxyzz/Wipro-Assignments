create TABLE Employee (
     employee_id int PRIMARY KEY,
     first_name VARCHAR(50),
	salary DECIMAL(10,2),
    department VARCHAR(255)
    );
    
    insert into employee(employee_id , first_name, salary, department)
    values (1,'Arjun ', 25000.00 , 'IT'),
            (2, 'Mahesh', 14500.00, 'HR'),
              (3, 'charan', 6000.00, 'Finance'),
              (4, 'pawan', 6000.00, 'IT'),
              (5, 'tarak', 15500.00, 'HR'),
              (6, 'jagan', 9500.00, 'Finance');
    
    select * from employee;
    
    #Highest Salary
    select * from employee order by salary desc limit 1;
    
    # Employees with Salary Greater Than 5000
    select * from employee where salary >5000.00;
    
    #Get Employee Names and Salaries
    select first_name, salary from employee;
    
    #Count Employees
    select count(*) from employee;
    
    #Group Employees by Department
    select department, count(*) as employee_count FROM employee 
    GROUP BY department;
    
    #Calculate Average Salary
    SELECT AVG(salary) AS average_salary
       FROM employee;
       
	#Sort Employees by Salary
    SELECT * from employee 
    order by salary desc;
    
    #Find Employee with Second Highest Salary
    select * from employee order by salary desc limit 1 offset 1;
    
    #Find Employee with Longest Name
    SELECT * FROM employee ORDER BY LENGTH(first_name) DESC LIMIT 1;
    
    #Group Employees by Department and Calculate Average Salary
       SELECT department, AVG(salary) AS average_salary FROM employee
              GROUP BY department;
              
	#Find Top 3 Highest Paid Employees
    Select * from employee order by salary desc limit 3;
    
    #Calculate Total Salary of All Employees Using Reduce
    select sum(salary) as totalSalary from employee;
	
    # Sort Employees by Salary
    SELECT * FROM employee ORDER BY Salary ASC;
    
    #Partition Employees by Salary Threshold
    SELECT first_name, 
       CASE 
           WHEN salary > 5000 THEN 'Above Threshold'
           ELSE 'Below Threshold'
       END AS SalaryCategory
FROM employee;
    
