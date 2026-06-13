public class day7a{
    interface Employee {

        String solveProblem();
        String work();
    }
    static class BankEmployee implements Employee {
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public String solveProblem() {
            System.out.println("Problem Solved");
            return "Problem Solved";
        }

        @Override
        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }

        void display() {
            System.out.println("Name:" + "name");
            System.out.println("ID:" + "id");
            System.out.println("Salary:" + "salary");
        }
    }
   static class CheckingEmployee implements Employee {
       String name;
       String id;
       int salary;

       CheckingEmployee(String name, String id, int salary) {
           this.name = name;
           this.id = id;
           this.salary = salary;
       }
        @Override
        public String solveProblem() {
            System.out.println("Problem Solved        git");
            return "Problem Solved";
        }

        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }
    }

    public static void main(String[] args) {
        BankEmployee bankEmployee = new BankEmployee("Dheshnaashri", "7895", 50000);
        bankEmployee.solveProblem();
        bankEmployee.work();

        CheckingEmployee checkingEmployee = new CheckingEmployee("Ashmitha", "9876", 60000);
        checkingEmployee.solveProblem();
        checkingEmployee.work();

    }
}