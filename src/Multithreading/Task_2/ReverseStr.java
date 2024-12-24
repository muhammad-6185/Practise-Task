package Multithreading.Task_2;

public class ReverseStr {

    public String reverseStr(String inputStr, String generatedStr, int pointer) {
        if (pointer == 0) {
           return generatedStr + inputStr.charAt(pointer);
        }

        generatedStr = generatedStr + inputStr.charAt(pointer);

        pointer--;
        return reverseStr(inputStr, generatedStr, pointer);
    }

}
