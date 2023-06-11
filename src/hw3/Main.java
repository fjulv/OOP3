package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Market market = new Market("tomato", "Anna", 8);
        market.isOpen(14);

        System.out.println();

        List<Personal> employees = new ArrayList<>();
        employees.add(new Personal("Bob", 18, 10000));
        employees.add(new Personal("Nino", 32, 20000));
        employees.add(new Personal("Sam", 22, 15000));
        employees.add(new Personal("Don", 58, 89000));
        employees.add(new Personal("Kate", 27, 17000));

        Collections.sort(employees);

        for (Personal employee : employees) {
            System.out.println("Имя сотрудника: " + employee.getNamePersonal()
                    + ". Возраст сотрудника: " + employee.getAge() + " лет"
                    + ". Заработная плата сотрудника: " + employee.getSalary() + ".");
        }
    }
}
