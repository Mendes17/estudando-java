package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "A:\\Curso java\\interfaces\\5_interface_comparable\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeCsv = br.readLine();
            while (employeCsv != null) {
                String[] fields = employeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee employee : list) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }
        } catch(IOException e) {
            e.getMessage();
        }

    }

}
