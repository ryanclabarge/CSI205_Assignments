public class TestTime {
    public static void main(String[] args) {
        TimeType time1 = new TimeType();
        TimeType time2 = new TimeType(23, 59, 58);
        TimeType time3 = new TimeType(time2);
        TimeType time4 = new TimeType(25,100,12);
        System.out.printf("%s%n%s%n%s%n%s%n", time1.toString(), time2.toString(), time3.toString(),"Time 4 = "+time4.toString());
        if (time1.Set(25, 0, 0)) {
            System.out.println(time1.toString());
        } else System.out.println("Not Valid");
        for (int i=1; i<=10; i++){
            time2.Increase();
            System.out.println(time2.toString());
        }
        for (int i=1;i<=10; i++){
            time2.Decrease();
            System.out.println(time2.toString());
        }
    }
}
