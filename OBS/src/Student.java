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