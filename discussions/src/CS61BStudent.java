public class CS61BStudent {
    public int idNumber;
    public int grade;
    public static String instructor = "Hug";

    public CS61BStudent(int id){
        this.idNumber = id;
        this.grade = 100;
    }

    public boolean watchLecture(){
        // Returns whether hte student actually watched the lecture
        return true;
    }

    public static String getInstructor(){
        return "instructor " + instructor + " is here";
    }
}
