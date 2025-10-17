package student;

public class Test {
    public static void main(String[] args) {
        Major ai=new Major("code2","ai");
        Major cs=Major.COMPUTER_SCIENCE;

        Student student1=new Student("Alami","Samir","telephone","email","cne");
        Student student2=new Student("kadir","ali","telephone","email","cne2");
        Student student3 =new Student("sarih","salah","telephone","email","cne3",ai);


        // Display computer science students
        System.out.println("The list of students in the computer science major is: ");
        cs.displayStudents();
        System.out.println("display students info using getFullNameFormatted");
        System.out.println(student1.getFullNameFormatted());
        System.out.println(cs.findStudentByCNE("cne"));
        System.out.println(cs.removeStudent("cne"));
        System.out.println(cs.getOccupancyRate());

    }



}
