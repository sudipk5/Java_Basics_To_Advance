//public class StuDent {
//        int id;
//        String name;
//
//        void display() {
//            System.out.println(id + " " + name);
//        }
//
//        public static void main(String[] args) {
//            // Object Declaration and Creation
//            StuDent s1 = new StuDent();
//            StuDent s2 = new StuDent();
//
//            // Assign values
//            s1.id = 101;
//            s1.name = "Sudip";
//
//            s2.id = 102;
//            s2.name = "Bidisha";
//
//            // Calling methods
//            s1.display();
//            s2.display();
//            System.out.println(s1);
//            System.out.println(s2);
//        }
//    }
//
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;       // 'this.id' means object's id
        this.name = name;   // 'this.name' means object's name
    }

    void display() {
        System.out.println(this.id + " " + this.name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sudip");
        s1.display();
    }
}




