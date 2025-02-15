import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CS61B {
// Variables (part a)
    public static String university = "US Berkeley";
    public String semester;
    public CS61BStudent[] students;

// Constructor (part b)
    public CS61B(int capacity, CS61BStudent[] signups, String semester){
        students = new CS61BStudent[capacity];
        for(int i = 0; i < signups.length && i < capacity; i++){
            students[i] = signups[i];
        }

        this.semester = semester;
    }

// Methods (part c)
/** Makes every CS61BStudent enrolled in this semester of the course watch lecture. Returns the
 number of students who actually watched lecture. */
    public int makeStudentWatchLecture(){
        int count = 0;
        for(CS61BStudent student: students){
            if (student.watchLecture()){
                count++;
            }
        }
        return count;
    }

/** Takes in a new university name newUniversity and changes the university
 for all semesters of CS61B to newUniversity. */
    public void changeUniversity(String newUniversity){
        university = newUniversity;
    }
// Expansion (part d)
/** Expands the course to the given capacity. */
    public void expandCourse(int capacity){
        CS61BStudent[] newStudents = new CS61BStudent[capacity];
        for(int i = 0; i < students.length; i++){
            newStudents[i] = students[i];
        }
        students = newStudents;
    }
}
