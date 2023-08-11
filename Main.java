import java.time.LocalDate;
public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Tunuk", LocalDate.of(2007,7,30),"+996 707 016 588", "Kyrgyz");
        Student student2 = new Student("Zalkar",LocalDate.of(2007,4,15), "+996 345 543 345", "Kyrgyz");
        Student student3 = new Student("Erkin ", LocalDate.of(2002,11,23), "+996 567 765 567", "Kyrgyz");
        Student student4 = new Student("Kandybek", LocalDate.of(2008,6,19), "+996 234 432123", "Kyrgyz");
        Student student5 = new Student("Alina", LocalDate.of(2001,8,31), "+996 456 654 234", "Kyrgyz");
        Student[] studentsArray = {student1, student2, student3, student4, student5};

        for (Student student : studentsArray) {
            System.out.println("-------------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Date of Birth: " + student.getDateOfBirth());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println("Nationality: " + student.getNationality());
            System.out.println("-------------------------------------");
        }
    }
}
