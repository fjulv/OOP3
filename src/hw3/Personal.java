package hw3;

public class Personal implements Comparable<Personal> {

    private String namePersonal;
    private int age;
    private int salary;

    public Personal(String namePersonal, int age, int salary) {
        this.namePersonal = namePersonal;
        this.age = age;
        this.salary = salary;
    }

    public String getNamePersonal() {
        return namePersonal;
    }

    public void setNamePersonal(String namePersonal) {
        this.namePersonal = namePersonal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Personal o) {
        return Integer.compare(this.salary, o.salary);
//        if (this.salary > o.salary) {
//            return 1;
//        }
//        if (this.salary < o.salary) {
//            return -1;
//        } else return 0;
    }
}

