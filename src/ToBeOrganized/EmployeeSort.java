package ToBeOrganized;

class EmployeeSort implements Comparable<EmployeeSort>
{
    private String name;
    private int age;
    private int salary;

    public EmployeeSort(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(EmployeeSort employee)
    {
        return this.age - employee.age;
    }

    public String toString()
    {
        return String.format("(%s, %d)", name, age);
    }

}