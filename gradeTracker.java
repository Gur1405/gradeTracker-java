import java.util.*;

public class gradeTracker {
    public static void main( String args[]){
        System.out.println("********* STUDENT GRADE TRACKER ********* ");
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number of students : ");
        int numStudents= sc.nextInt();
        sc.nextLine();
        
        String[] studentNames = new String[numStudents];
        int[] totalMarks = new int[numStudents];
        double[] averages = new double[numStudents];
        String[] grades = new String[numStudents];

        int highestIndex = 0 ;
        int lowestIndex = 0 ;

        for(int s = 0; s < numStudents; s++) {
    System.out.println("\n--- Student " + (s + 1) + " ---");
    System.out.print("Enter name of Student " + (s + 1) + ": ");
    studentNames[s] = sc.nextLine();  


        System.out.print("Enter total number of subject :");
        int numsubject = sc.nextInt();
        sc.nextLine();

        int total= 0;

        for(int i =0; i < numsubject ; i++){
            System.out.println("enter marks of subject " + i + " out of 100");
            int marks = sc.nextInt();
            // input validation 
            while(marks<0 || marks>100){
                System.out.println("Invalid input! Enter marks between 0 and 100:");
                marks = sc.nextInt(); 
            }
            total += marks;
        }
        

        System.out.println("Student result");
        System.out.println(" Total marks obtain in all subject " + total );
        

        // calculate average percentage 
        totalMarks[s] = total;
        averages[s] = (double) total/ numsubject;
        

        //add grades
        if(averages[s]>=90) grades[s]="A+";
        else if (averages[s]>=82) grades[s]="A";
        else if (averages[s]>=73) grades[s]="B+";
        else if (averages[s]>=64) grades[s]="B";
        else if (averages[s]>=55) grades[s]="c+";
        else if (averages[s]>=50) grades[s]="c";
        else grades[s]="FAIL";
        
        // track highest and lowest 
        if (averages[s] > averages[highestIndex]) highestIndex = s;
        if (averages[s] < averages[lowestIndex]) lowestIndex = s;
        
        sc.nextLine();
    }

    
    System.out.println("\n========= SUMMARY REPORT =========");
System.out.printf("%-15s %-15s %-10s\n", "Name", "Average (%)", "Grade");

for (int s = 0; s < numStudents; s++) {
    System.out.printf("%-15s %-15.2f %-10s\n", studentNames[s], averages[s], grades[s]);
}


System.out.println("\nTop Scorer: " + studentNames[highestIndex] + " (" + averages[highestIndex] + "%)");
System.out.println("Lowest Scorer: " + studentNames[lowestIndex] + " (" + averages[lowestIndex] + "%)");
    
sc.close();
    }
}

        

            