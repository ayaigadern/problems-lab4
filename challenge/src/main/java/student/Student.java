package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {
        super();
        this.major=Major.COMPUTER_SCIENCE;
        this.major.addStudent(this);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
       super(prenom,nom,telephone,email);
       this.cne=cne;
        this.major=major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom,prenom,telephone,email);
        this.major=Major.COMPUTER_SCIENCE;
        this.major.addStudent(this);
        this.cne=cne;

    }

    // Getters

    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }


    // Setters


    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getFullNameFormatted(){
        String result=String.format("%s %s",secondName.toUpperCase(),firstName);
        return result;
    }
}
