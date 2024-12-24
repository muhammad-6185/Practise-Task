package ProblemSolving;


import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int target = 15;

        ProblemSolving problemSolving = new ProblemSolving();
        System.out.println(problemSolving.subArraySum(arr, target));
//
//        int[] arr1 = new int[] {4,2,6,3,5,1};
//        System.out.println("Missing Number: " + problemSolving.findMissingNumber(arr1));

//        int[] arr2 = new int[] {-79,-68,-18,-58,25,52,-68,-30, 6, 10};
//        System.out.println("Max Sub Array Sum: " + problemSolving.maxSubarraySum(arr2));

//        List<String> str = new ArrayList<>();
//        str.add("Ajao");
//        str.add("Or");
//        str.add("Caaallll");
//        str.add("Dooooooooo Itttt");
//        str.add("Foooo");
//        str.add("Hellooooo");
//
//        List<Student> students = str.stream().map(Student::new).collect(Collectors.toList());
//
//        problemSolving.printStudents(students);

//        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//
//        Date parsedDateTime;
//
//        try {
//            parsedDateTime = df.parse("1899-12-30 00:00:00");
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
//        Timestamp date = Timestamp.valueOf("1899-12-30 00:00:00");
//
//        System.out.println(date);


        int[] testArr = new int[2];
        System.out.println(String.format("Array Length %d",testArr.length));
    }


}
