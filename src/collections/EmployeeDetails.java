package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public final class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        try (FileInputStream fs = new FileInputStream("C:\\repositories\\interview-programs-java\\src\\collections\\testdata.csv")) {
            byte[] allBytes = fs.readAllBytes();
            String allData = new String(allBytes);
            String lines[] = allData.split("\n");
            for (int i = 1; i < lines.length; i++) {
                String[] words = lines[i].split(",");
                System.out.println("words[0] = " + words[0]);
                System.out.println("words[0] = " + words[1]);
                System.out.println("words[0] = " + words[2]);
                list.add(new Employee(Integer.parseInt(words[0].trim()),words[1],Integer.parseInt(words[2].trim())));
            }
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

//        list.sort(new SortEmployeeUsingSalary());
//        list.sort(Comparator.comparing(Employee::name));

        list.sort(new SortEmployee());

        System.out.println("list = " + list);
    }
}

class SortEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.salary() != o2.salary()) {
            return o1.salary() - o2.salary();
        }
        else if(!o1.name().equals(o2.name()))
            return o1.name().compareTo(o2.name());
        else
            return o1.mobile() - o2.mobile();
    }
}


final class Employee {
    private final int salary;
    private final String name;

    public int mobile() {
        return mobile;
    }

    private final int mobile;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public Employee(int salary, String name, int mobile) {
        this.salary = salary;
        this.name = name;
        this.mobile=mobile;
    }

    public int salary() {
        return salary;
    }

    public String name() {
        return name;
    }
}