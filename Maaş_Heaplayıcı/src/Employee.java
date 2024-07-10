public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(){
        if(this.salary <= 1000){
            return 0;
        }
        else{
            return (this.salary / 100)* 3;
        }
    }

    int bonus(){
        if(this.workHours >= 40){
            return (workHours - 40) * 30;
        }
        else{
            return 0;
        }
    }

    int raiseSalary(){
        if(2024 - this.hireYear < 10){
            return (this.salary / 100) * 5;
        }
        else if(2024 - this.hireYear > 9 && 2024 - this.hireYear < 20){
            return (this.salary / 100) * 10;
        }
        else{
            return (this.salary / 100) * 15;
        }
    }

    void Print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus() );
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
        this.salary = this.salary - tax() + bonus() + raiseSalary();
        System.out.println("Toplam maaş : " + (this.salary));
        System.out.println("===================");
    }
}
