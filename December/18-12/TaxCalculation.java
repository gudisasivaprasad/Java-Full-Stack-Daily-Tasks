/*public class TaxCalculation{

    void main(){
        int choice = Integer.parseInt(IO.readln());
        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double basicSalary = Double.parseDouble(IO.readln());
        double hra = Double.parseDouble(IO.readln());
        double da = Double.parseDouble(IO.readln());

        TaxUtil taxutil = new TaxUtil();

        switch(choice){
            case 1 -> {
            Employee e = new Employee(id, name, basicSalary, hra, da);
            IO.println("Gross Salary : " + e.calculateGrossSalary());
            IO.println("Tax : " + taxutil.calculateTax(e));
            }

            case 2 -> {
                double projectAllowance = Double.parseDouble(IO.readln());
                Manager m = new Manager(id, name, basicSalary, hra, da,projectAllowance);
                IO.println("Gross Salary : " + m.calculateGrossSalary());
                IO.println("Tax : " + taxutil.calculateTax(m));
            }

            case 3 -> {
                int batchCount = Integer.parseInt(IO.readln());
                double perkPerBatch = Double.parseDouble(IO.readln());
                Trainer t = new Trainer(id , name, basicSalary, hra, da, batchCount,perkPerBatch);
                IO.println("Gross Salary : " + t.calculateGrossSalary());
                IO.println("Tax : " + taxutil.calculateTax(t));
            }

            case 4 -> {
                double target = Double.parseDouble(IO.readln());
                double reached = Double.parseDouble(IO.readln());
                double perkPerEnrollment = Double.parseDouble(IO.readln());
                Sourcing s = new Sourcing(id, name, basicSalary, hra, da, target, reached,perkPerEnrollment);
                IO.println("Gross Salary : " + s.calculateGrossSalary());
                IO.println("Tax : " + taxutil.calculateTax(s));
            }

            default  -> IO.println("Wrong Input");
        }


    }
}



class Employee{
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;

    public Employee(int employeeId, String employeeName, double basicSalary, double HRAPer, double DAPer){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
    } 

    public double calculateGrossSalary(){
        return basicSalary + HRAPer + DAPer;
    }
}

class Manager{
    private int managerId;
    private String managerString;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private double projectAllowance;

    public Manager(int managerId, String managerString, double basicSalary,double HRAPer, double DAPer, double projectAllowance){
        this.managerId =managerId;
        this.managerString = managerString;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.projectAllowance = projectAllowance;
    }

    public double calculateGrossSalary(){
        return basicSalary + HRAPer + DAPer + projectAllowance;
    }
}

class Trainer{
    private int trainerId;
    private String trainerName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private int batchCount;
    private double perkPerBatch;

    public Trainer(int trainerId, String trainerName, double basicSalary,   double HRAPer, double DAPer, int batchCount,double perkPerBatch){
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }
     

    public double calculateGrossSalary(){
        return basicSalary + HRAPer + DAPer + (batchCount * 
        perkPerBatch);
    }

}

class Sourcing{
    private int sourceId;
    private String sourceName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private double enrollmentTarget;
    private double enrollmentReached;
    private double perkPerEnrollment;

    public Sourcing(int sourceId, String sourceName, double basicSalary, double HRAPer,double DAPer, double enrollmentTarget,double enrollmentReached, double perkPerEnrollment){
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;

    }

    public double calculateGrossSalary(){
        return basicSalary + HRAPer + DAPer + (((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
    }
}

class TaxUtil{
    public double calculateTax(Employee e){
        double gross = e.calculateGrossSalary();
        return (gross > 50000) ? gross * 0.20 : gross * 0.05;
    }

    public double calculateTax(Manager m){
        double gross = m.calculateGrossSalary();
        return (gross > 50000) ? gross * 0.20 : gross * 0.05;
    }

    public double calculateTax(Trainer t){
        double gross = t.calculateGrossSalary();
        return (gross > 50000) ? gross * 0.20 : gross * 0.05;
    }

    public double calculateTax(Sourcing s){
        double gross = s.calculateGrossSalary();
        return (gross > 50000) ? gross * 0.20 : gross * 0.05;
    }
}*/