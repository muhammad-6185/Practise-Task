package Multithreading.Task_2;

public class main {

    public static void main(String[] args) {

        String string = "Bobby";

        ReverseStr reverseStr = new ReverseStr();
        System.out.println(reverseStr.reverseStr(string, "", string.length()-1));
    }

}
