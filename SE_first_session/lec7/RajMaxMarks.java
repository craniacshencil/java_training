import java.util.Scanner;
class RajMaxMarks{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number of semesters: ");
        int noOfSemester = sc.nextInt();
        int coursesPerSemester[] = new int[noOfSemester];
        int marksPerSemester[][] = new int[noOfSemester][10];
        for(int i = 0; i < noOfSemester; i++){
            System.out.println("Enter the number of courses in semester " + (i + 1));
            coursesPerSemester[i] = sc.nextInt();
        }

        for(int j = 0; j < noOfSemester; j++){
            System.out.println("Marks obtained in semester " + (j + 1));
            for(int k = 0; k < coursesPerSemester[j]; k++){
                marksPerSemester[j][k] = sc.nextInt();
                while((marksPerSemester[j][k] < 0) || (marksPerSemester[j][k] > 100)){
                    System.out.println("Invalid marks should be between 0 and 100");
                    marksPerSemester[j][k] = sc.nextInt();
                }
            }
        }

        for(int l = 0; l < noOfSemester; l++){
            int max = marksPerSemester[l][0];
            for(int m = 1; m < coursesPerSemester[l]; m++){
               if(marksPerSemester[l][m] > max) 
                    max = marksPerSemester[l][m];
            }
            System.out.println("Maximum marks in semester " + (l + 1) + ": " + max);
        }
    }
}
