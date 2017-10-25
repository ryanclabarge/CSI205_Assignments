import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        array = new int[6]; //or you could do the next line
        int[] otherarray = new int[6]; //so either way works
        System.out.println(array.length); //array.length is not a method, it is a public instance variable, that is implictly defined in the method
        array[5] = 35;  //or the next two lines
        int n = 4;
        array[n] = 25;
        System.out.println(array[5] + " " + array[n]);
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter a date in the form MM/DD/YYYY");
        String date = scan.next();
        String[] dates = date.split("/");
        int years = Integer.parseInt(dates[2]);
        int month = Integer.parseInt(dates[0]);
        int day = Integer.parseInt(dates[1]);
        if (years % 4 == 0) {
            months[1] = 29;
            if (years % 100 == 0) {
                months[1] = 28;
                if (years % 400 == 0) {
                    months[1] = 29;
                }
            }
        }
        if (0<=month && month<=11 && day<=months[month - 1]) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}


