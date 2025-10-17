package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount=0;

    public static  final Major COMPUTER_SCIENCE=new Major("CODE_"," Computer Science");

    public Major(String code, String name) {
        this.code=code;
        this.name=name;
        this.students=new Student[50];


    }

    // Method to add a student
    public void addStudent(Student s) {
        if( studentCount>=50){
            System.out.println("Student limit exceeded");
        }
        else{
            this.students[getStudentCount()]=s;
            studentCount++;


        }

    }

    // Getters

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        for(var i :this.getStudents()){
            if(i!=null){
                System.out.println(i.toString());
            }
        }

    }

    public Student findStudentByCNE(String cne){
        for(int i=0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne){
        if(findStudentByCNE(cne)!=null){
            Student s=findStudentByCNE(cne);
            for(int i=0;i<studentCount;i++){
                if(students[i]==s){
                    for(int j=i;j<studentCount-1;j++){
                        students[j]=students[j+1];
                    }
                }
            }
            studentCount--;
            students[getStudentCount()]=null;
        }
        return false;
    }
    public String getOccupancyRate(){
        String result=String.format("%s capacity: : 50 students \n Current enrollment: %d students\n Occupancy rate = %.2f%% ",this.name,this.studentCount,(this.studentCount*1.0/50)*100);
        return result;
    }
    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i].toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}