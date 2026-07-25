package Day13;
class student {
    private int studentid;
    private String studentname;


    void setstudent(int studentid, String studentname) {
        this.studentid = studentid;
        this.studentname = studentname;

    }

    void displaystudent() {
        System.out.println("Student id:"+studentid);
        System.out.println("student name:"+studentname);

    }
}

class mentor extends student {
    private int mentorid;
    private String mentorname;


    void setmentor(int mentorid, String mentorname) {
        this.mentorid = mentorid;
        this.mentorname = mentorname;


    }

    void displaymentor() {
        System.out.println("mentor id:" + mentorid);
        System.out.println("mentor name:" + mentorname);

    }

}

class hod extends mentor {
    private int hodid;
    private String hodname;


    void sethod(int hodid, String hodname) {
        this.hodid = hodid;
        this.hodname = hodname;
    }

    void displayhod() {
        System.out.println("hod id:" + hodid);
        System.out.println("hod name:" + hodname);
    }



}
public class Student_Database {
    public static void main(String[]args){
        hod h=new hod();
        h.setstudent(116,"jack");
        h.setmentor(202,"bob");
        h.sethod(980,"priya");
        System.out.println("student details");
        h.displaystudent();
        System.out.println();
        System.out.println("mentor details");
        h.displaymentor();
        System.out.println();
        System.out.println("hod details");
        h.displayhod();
    }

}