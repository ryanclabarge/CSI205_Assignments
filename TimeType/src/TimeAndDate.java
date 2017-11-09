public class TimeAndDate extends TimeType{
    private int month,day,year;
    private int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean leapyear(int years){
        if (years % 4 == 0) {
            date[1] = 29;
            if (years % 100 == 0) {
                date[1] = 28;
                if (years % 400 == 0) {
                    date[1] = 29;
                    return true;
                }
                return false;
            }
            return true;
        }
        else{
            return false;
        }
    }

    public TimeAndDate(){
        super();
        this.month = 1;
        this.day = 1;
        this.year=1980;
        leapyear(1980);
    }

    public boolean setTimeAndDate(int hrs, int min, int sec, int month, int day, int year) {
        leapyear(year);
        if (0 <= hrs && hrs <= 23 && 0 <= min && min <= 59 && 0 <= sec && sec <= 59 && 0 <= month - 1 && month - 1 <= date.length && 1 <= day && day <= date[month - 1]) {
            super.Set(hrs, min, sec);
            this.month = month;
            this.day = day;
            this.year = year;
            return true;
        }
        else return false;
    }

    public void increaseDay(){
        this.day +=1;
        if(this.day>date[month-1]){
            this.day = 1;
            this.month +=1;
            if(this.month > date.length-1){
                this.month = 1;
                this.year += 1;
            }
        }
    }

    public void decreaseDay(){
        this.day -=1;
        if(this.day<1){
            this.month -=1;
            this.day = date[month-1];
            if(this.month < 1){
                this.month = 12;
                this.year -= 1;
            }
        }
    }

    public String toString(){
        return (String.format("%02d/%02d/%d",month,day,year)+" "+super.toString());
    }

    public void increaseSecond(){
        super.Increase();
        if (super.getHour() == 0 && super.getMinute()==0 && super.getSecond()==0){
            increaseDay();
        }
    }

    public void decreaseSecond(){
        super.Decrease();
        if (super.getHour() == 23 && super.getMinute()==59 && super.getSecond()==59){
            decreaseDay();
        }
    }

}
