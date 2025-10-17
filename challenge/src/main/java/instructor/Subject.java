package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

    public String normalizedCode(){
        StringBuilder newString=new StringBuilder();
        for(int i=0;i<code.length();i++){
            Character c=code.charAt(i);
            if(c.equals(' ')){
                continue;
            }
            newString.append(c);
        }

        return newString.toString().toUpperCase();
    }

    public String properTitle() {
        if (title == null || title.isEmpty()) {
            return title;
        }
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.isEmpty()) continue;
            sb.append(Character.toUpperCase(word.charAt(0)));
            if (word.length() > 1) {
                sb.append(word.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public  boolean isIntroCourse(){
        boolean titleContainsIntro= title.contains("INtro");
        boolean codeContains=code.contains("INTRO-");
        if(titleContainsIntro || codeContains){
            return true;
        }
        return false;
    }
    public String syllabusLine(Instructor instructor){
        StringBuilder sb=new StringBuilder();
        sb.append(code).append(" - ").append(title).append("(Instructor: ").append(instructor.getSecondName()).append(" ").append(instructor.getFirstName());
        return sb.toString();
    }



}
