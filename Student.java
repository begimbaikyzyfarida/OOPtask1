import java.time.LocalDate;
class Student {
    private String name;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String nationality;

    public Student(String name, LocalDate dateOfBirth, String phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public String getName() {

        return name;
    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }
    public String getPhoneNumber() {

        return phoneNumber;
    }

    public String getNationality() {

        return nationality;
    }
