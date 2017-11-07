public class TimeZone extends TimeType { //TimeType is the SuperClass TimeZone is the subclass
    private int timezone;

    public TimeZone(){
        super();        //super is a keyword to call the constructor from TimeType super has to be first as well
        timezone = 0;
    }

    public boolean TimeZone(int hour, int minute, int second,int timezone) {
        if (super.Set(hour, minute, second)) {
            this.timezone = timezone;
            return true;
        } else return false;
    }

    public void increaseSecond(){
        super.Increase();
    }

    public String toString(){
        return super.toString()+" "+timezone;
    }
}
