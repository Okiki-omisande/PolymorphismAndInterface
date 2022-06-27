public class payrollTest {
    public static void main(String[] args) {
        Payroll[] payroll = new Payroll[6];
        payroll[0] = new Invoice("12345","electric fan",3,30.0);
        payroll[1] = new Invoice("54321","electric kettle",2,25.0);
        payroll[2] = new CommissionEmployee("OKIKI","OMISANDE","987",0.2,700);
        payroll[3] = new basePlusCommissionEmployee("BOLA","AWE","654",0.12,2000.0,300);
        payroll[4] = new salariedEmployee("WEMI","DIOUF","234",800);
        payroll[5] = new hourlyEmployee("CLARA","RAUF","111",60,12.0);

        for (Payroll counter : payroll){
            System.out.println(counter);

            if (counter instanceof basePlusCommissionEmployee){
             ((basePlusCommissionEmployee) counter).setBaseSalary(1.10 * ((basePlusCommissionEmployee) counter).getBaseSalary());
                System.out.printf("%s: $%,.2f%n","new base salary", ((basePlusCommissionEmployee) counter).getBaseSalary());
            }

            System.out.printf("%s: %,.2f%n%n","Payment due",counter.getPayableAmount());
        }
    }
}
