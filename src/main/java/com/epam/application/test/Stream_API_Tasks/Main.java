package com.epam.application.test.Stream_API_Tasks;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeDetails = Employee_data.getEmployeeDetails();
        // 1.
        Long maleCount = employeeDetails.stream().filter((e) -> e.getGender().equals("Male")).count();
        System.out.println("Total no. of Male employees are " + maleCount);
        Long femaleCount = employeeDetails.stream().filter((e) -> e.getGender().equals("Female")).count();
        System.out.println("Total no. of Female employees are " + femaleCount );
        Map<String, Long> maleFemaleEmp = employeeDetails.stream().collect(Collectors.groupingBy((e)->e.getGender(),Collectors.counting()));
        System.out.println(maleFemaleEmp);
        // 2.
        List<String> departments = employeeDetails.stream().map((e) -> e.getDepartment()).distinct().collect(Collectors.toList());
        System.out.println("Following are departments in the organisation " + departments );
        // 3.
        Optional<Integer> maleAgeSum = employeeDetails.stream().filter((e) -> e.getGender().equals("Male")).map((e) -> e.getAge()).reduce((x, y)->x+y);
        System.out.println("Average age of male is " + maleAgeSum.get()/maleCount);
        Optional<Integer> femaleAgeSum = employeeDetails.stream().filter((e) -> e.getGender().equals("Female")).map((e) -> e.getAge()).reduce((x, y)->x+y);
        System.out.println("Average age of female is " + femaleAgeSum.get()/femaleCount);
        // Alternate way
        System.out.println(employeeDetails.stream().collect(Collectors.groupingBy((e)->e.getGender()
                ,Collectors.averagingInt(Employee::getAge))));
        // 4.
        List<Employee> highestPaidEmployee = employeeDetails.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).limit(1).collect(Collectors.toList());
        System.out.println("Details of highest paid employee " + highestPaidEmployee );
        // 5.
        List<String> employeesJoiningAfter2015 = employeeDetails.stream().filter((e) -> e.getYearOfJoining() > 2015 ).map((e) -> e.getName()).collect(Collectors.toList());
        System.out.println("Employees joining after 2015 are " + employeesJoiningAfter2015 );
        // 6.
        Map<String, Long> departmentCount = employeeDetails.stream().collect(Collectors.groupingBy((e)->e.getDepartment(),Collectors.counting()));
        System.out.println( "No. of employees per department are " + departmentCount );
        // 7.
        Map<String, Double> departmentAvgSalary = employeeDetails.stream().collect(Collectors.groupingBy((e) -> e.getDepartment(),Collectors.averagingDouble((e)->e.getSalary())));
        System.out.println( "Average salaries per department is " + departmentAvgSalary );
        // 8.
        Optional<Employee> youngestEmpInPD = employeeDetails.stream().filter((e) -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male")).sorted((e1,e2) -> e1.getAge()-e2.getAge()).findFirst();
        System.out.println("Youngest male employee in Product Development " + youngestEmpInPD.get() );
        // 9.
        Optional<Employee> expEmp = employeeDetails.stream().sorted((e1,e2) -> e1.getYearOfJoining()-e2.getYearOfJoining()).findFirst();
        System.out.println("Most working experience employee is " + expEmp );
        // 10.
        System.out.println(employeeDetails.stream().filter((e)->e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy((e) -> e.getGender(),Collectors.counting())));
        // 11.
        Map<String, Double> avgSalaryMNF = employeeDetails.stream().collect(Collectors.groupingBy((e)->e.getGender(),Collectors.averagingDouble((e)->e.getSalary())));
        System.out.println("Average salary of male and female employees " + avgSalaryMNF);
        // 12.
        Map<String,List<String>> empDep = employeeDetails.stream().collect(Collectors.groupingBy((e)->e.getDepartment(),Collectors.mapping((e)->e.getName(), Collectors.toList())));
        System.out.println("Names of all employees in each department " + empDep);
        // 13.
        Optional<Double> totalSalary = employeeDetails.stream().map((e)->e.getSalary()).reduce((x,y)->x+y);
        System.out.println("Total Salary of whole organization is " + totalSalary.get());
        Double avgSalary = employeeDetails.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Avg Salary of whole organization is " + avgSalary);
        // 14.
        List<Employee> youngerThan25 = employeeDetails.stream().filter((e)->e.getAge()<=25).collect(Collectors.toList());
        System.out.println("Employees younger than or equal 25 " + youngerThan25 );
        List<Employee> olderThan25 = employeeDetails.stream().filter((e)->e.getAge()>25).collect(Collectors.toList());
        System.out.println("Employees older than 25 " + olderThan25);
        // Alternate way
        Map<Boolean,List<String>> ls = employeeDetails.stream().collect(Collectors.partitioningBy(e->e.getAge()<25, Collectors.mapping(e->e.getName(),Collectors.toList())));
        System.out.println( ls );

        // 15.
        Optional<Employee> oldestEmp = employeeDetails.stream().sorted((e1,e2)->e2.getAge()-e1.getAge()).findFirst();
        System.out.println("Age of oldest emp is " + oldestEmp.get().getAge() + " and his department is " + oldestEmp.get().getDepartment());

        Map<Integer,String> idNameMap = employeeDetails.stream().collect(Collectors.toMap((e)->e.getId(),(e)->e.getName()));
        System.out.println( idNameMap );
    }
}
