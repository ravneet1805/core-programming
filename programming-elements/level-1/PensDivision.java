//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.


public class PensDivision {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
