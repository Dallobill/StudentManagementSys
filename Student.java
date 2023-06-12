package school.management.system;

/**
 * Created by Ticoh Dallo
 * This class is responsible for keeping 
 * track of students fees, name, grade & fees paid
 */

 public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is $30k yearly
     * Fees paid initially is 0.
     * @param id for the student: unique.
     * @param name of the student. 
     * @param grade of the student.
     */

    public Student(int id, String name, int grade) {
        feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's names, students id.

    /**
     * Use to update the the students grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade){
        this.grade = grade;

    }

    /**
     * Keep adding fees to fees paid Field
     * Add fees to the fees paid.
     * The school is goin to recieve funds.
     * @param fees the fees that the student pays
     */

    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     * 
     * @return student id 
     */

    public int getId(){
        return id;
    }

    /**
     * 
     * @return name of student 
     */

    public String getName(){
        return name;
    }

    /**
     * 
     * @return grade of the student
     */

    public int getGrade(){
        return grade;
    }

    /**
     * 
     * @return fees student have paid
     */

    public int getFeesPaid(){
        return feesPaid;
    }

    /**
     * 
     * @return total fees of student
     */

    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     * 
     * @return the remaining fees.
     */

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+ " Total fees paid so far$ "+ feesPaid;
    }

 }