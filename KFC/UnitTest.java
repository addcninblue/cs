public class UnitTest
{
    public static void main(String[] args)
    {
        KFC kfc = new KFC();
        Employee john = new Employee("iPod", 10.37);
        john.setHours(30);
        kfc.addEmployee(john);
        Employee luc = new Employee("Luc", 2000);
        luc.setHours(5.3);
        kfc.addEmployee(luc);
        Employee teemu = new Employee("Teemu", 2.3);
        teemu.setHours(42);
        kfc.addEmployee(teemu);
        Employee panda = new Employee("Panda", 666);
        panda.setHours(55);
        kfc.addEmployee(panda);
        
        kfc.remove("Teemu");
        kfc.raiseForAll(5.5);
        kfc.raiseIndividually("Luc", 1994.5);
        kfc.printPayroll();
        //////////////* Expected Results *//////////////
        ////////////////////////////////////////////////
        //  iPod;    Hours: 30;     Monies:   476.10  //
        //  Luc;     Hours: 5.3;    Monies: 21200.00  //
        //  Panda;   Hours: 55;     Monies: 41968.75  //
        ////////////////////////////////////////////////
    }
}
