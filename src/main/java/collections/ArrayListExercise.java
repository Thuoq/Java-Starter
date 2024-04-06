package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayListExercise {
    public static void main(String[] args) {
        List <Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, "USA"));
        employeeList.add(new Employee("Dave", 34, "India"));
        employeeList.add(new Employee("Carl", 21, "USA"));
        employeeList.add(new Employee("Joe", 56, "Russia"));
        employeeList.add(new Employee("Amit", 64, "China"));
        employeeList.add(new Employee("Ryan", 19, "Brazil"));

        normalSolution(employeeList);


    }
    public static void normalSolution(List<Employee> employeeList){
        // filter all employees from USA using array collections
        List <Employee> filterList = new ArrayList<>();
        for(Employee employee : employeeList) {
            if(employee.country.equals("USA")) {
                filterList.add(employee);
            }
        }
        // remove all employees from USA using array collections using better O(n) and create new arr

        List <Employee> employeesFromUSA = new ArrayList<>();
        for (Employee employee : employeeList) {
            if(!employee.country.equals("USA")) {
                employeesFromUSA.add(employee);
            }
        }

        // create new list  sort the list by country
        List<Employee> sortedListByCountry = new ArrayList<>(employeeList);
        sortedListByCountry.sort((e1, e2) -> e1.country.compareTo(e2.country));
        // Print sorted format name age country
        for(Employee employee : sortedListByCountry) {
            System.out.println(employee.name + " " + employee.age + " " + employee.country);
        }


        System.out.println("Hello world!");
    }
    // public stream solution
    public static void streamSolution(List<Employee> employeeList) {
        // filter all employees from USA using array collections
        List <Employee> filterList = new ArrayList<>();
        employeeList.stream().filter(employee -> employee.country.equals("USA")).forEach(employee -> filterList.add(employee));
        // remove all employees from USA using array collections using better O(n) and create new arr

        List <Employee> employeesFromUSA = new ArrayList<>();
        employeeList.stream().filter(employee -> !employee.country.equals("USA")).forEach(employee -> employeesFromUSA.add(employee));

        // create new list  sort the list by country
        List<Employee> sortedListByCountry = new ArrayList<>(employeeList);
        sortedListByCountry.sort((e1, e2) -> e1.country.compareTo(e2.country));
        // Print sorted format name age country
        sortedListByCountry.forEach(employee -> System.out.println(employee.name + " " + employee.age + " " + employee.country));
    }
    public static void multiThreadSolutionWithCopyOnWWrite(){
        new CopyOnWriteArrayList<>();
        final ReentrantLock lock = new ReentrantLock();


    }
}
