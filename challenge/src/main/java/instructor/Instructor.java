package instructor;

import student.Student;

public class Instructor extends Student {
    private String employeeNumber;


    public String cleanEmployeeNumber(){
        StringBuilder trimmedString=new StringBuilder();
        for(int i=0;i<employeeNumber.length();i++){
            Character c=employeeNumber.charAt(i);
            if(c.equals(' ')){
                continue;
            }
            trimmedString.append(c);
        }
        return trimmedString.toString();
    }
    public  String summaryLine(){
        String result=String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber,this.secondName,this.firstName);
        return result;
    }
    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor \n----------\n");
        sb.append("Employee #: ").append(employeeNumber).append("\n");
        sb.append("Name      : ").append(secondName).append(", ").append(firstName).append("\n");
        sb.append("Email     : ").append(email).append("\n");
        sb.append("Phone     : ").append(phone).append("\n");
        return sb.toString();
    }
    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null && !firstName.trim().isEmpty()) {
            sb.append(firstName);
            sb.append(" ");
        }
        if (secondName != null && !secondName.trim().isEmpty()) {
            sb.append(secondName);
            sb.append(" ");
        }
        return sb.toString();
    }


}
