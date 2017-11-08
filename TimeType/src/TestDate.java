public class TestDate {
    public static void main(String[] args) {
        TimeAndDate time1 = new TimeAndDate();
        TimeAndDate time2 = new TimeAndDate();
        time2.setTimeAndDate(23, 59, 58, 2, 29, 1900);
        TimeAndDate time4 = new TimeAndDate();
        time4.setTimeAndDate(23, 39, 12, 2, 28, 1900);
        System.out.println(time4.toString());
        time4.increaseDay();
        System.out.println(time4.toString());
        //System.out.printf("%s%n%s%n%s%n%s%n", time1.toString(), time2.toString(), time3.toString(),"Time 4 = "+time4.toString());
        //if (time1.Set(25, 0, 0)) {
        /*    System.out.println(time1.toString());
        } else System.out.println("Not Valid");
        for (int i=1; i<=10; i++){
            time2.Increase();
            System.out.println(time2.toString());
        }
        for (int i=1;i<=10; i++){
            time2.Decrease();
            System.out.println(time2.toString());
        }
        */
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time4.toString());
    }
}

