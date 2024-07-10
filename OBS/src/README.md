# Kodlar

## Main
```java
public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addMatExamNotes(100,52);
        s1.addFizikExamNotes(85,35);
        s1.addKimyaExamNotes(24,95);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addMatExamNotes(24,84);
        s2.addFizikExamNotes(31,25);
        s2.addKimyaExamNotes(42,55);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addMatExamNotes(21,84);
        s3.addFizikExamNotes(45,25);
        s3.addKimyaExamNotes(65,95);
        s3.isPass();

    }
}
```

## Teacher
```java
public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}
```

## Student

```java
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int matort;
    int kimyaort;
    int fizikort;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addMatExamNotes(int mat1, int mat2){
        
        if (mat1 >= 0 && mat1 <= 100) {
            this.mat.note = mat1;
        }

        if (mat2 >= 0 && mat2 <= 100) {
            this.mat.mininote = mat2;
        }
        
    }

    public void addFizikExamNotes(int fiz1, int fiz2){
        
        if (fiz1 >= 0 && fiz1 <= 100) {
            this.fizik.note = fiz1;
        }

        if (fiz2 >= 0 && fiz2 <= 100) {
            this.fizik.mininote = fiz2;
        }
        
    }

    public void addKimyaExamNotes(int kimya1, int kimya2){
        
        if (kimya1 >= 0 && kimya1 <= 100) {
            this.kimya.note = kimya1;
        }

        if (kimya2 >= 0 && kimya2 <= 100) {
            this.kimya.mininote = kimya2;
        }
        
    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.matort = this.mat.note / 10 * 3 + this.mat.mininote / 10 * 7;
        this.fizikort = this.fizik.note / 10 * 3 + this.fizik.mininote / 10 * 7;
        this.kimyaort = this.kimya.note / 10 * 3 + this.kimya.mininote / 10 * 7;
        this.avarage = (this.matort + this.fizikort + this.kimyaort) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matort);
        System.out.println("Fizik Notu : " + this.fizikort);
        System.out.println("Kimya Notu : " + this.kimyaort);
    }

}
```

## Course

```java
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int mininote;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.mininote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
```