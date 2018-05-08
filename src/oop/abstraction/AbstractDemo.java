package oop.abstraction;

public class AbstractDemo {

    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

        /*Output
        Constructing an Employee
        Constructing an Employee
        Call mailCheck using Salary reference --
        Within mailCheck of Salary class
        Mailing check to Mohd Mohtashim with salary 3600.0

        Call mailCheck using Employee reference--
        Within mailCheck of Salary class
        Mailing check to John Adams with salary 2400.0*/
    }
}