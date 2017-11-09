public class TimeType {
        private int hour,minute,second;


    public TimeType() { this(0, 0, 0); }

    public TimeType(int hour, int minute, int second){
        this.Set(hour,minute,second); }

    public TimeType(TimeType time) { this(time.hour, time.minute, time.second);
    }

    public boolean Set(int hour, int minute, int second){
        if(0<=hour & hour<=23 & 0<=minute & minute<=59 & 0<=second & second<=59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            return true;
        }
        else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
            return false;
        }
    }

    public void Increase(){
        second += 1;
        if (second == 60){
            second = 0;
            minute +=1;
            if (minute == 60){
                minute = 0;
                hour += 1;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
    }

    public void Decrease(){
        second -= 1;
        if (second == -1){
            second = 59;
            minute -=1;
            if (minute == -1){
                minute = 59;
                hour -= 1;
                if (hour == -1){
                    hour = 23;
                }
            }
        }
    }

    public String toString(){
        return String.format("%02d:%02d:%02d %s",(this.hour==0 || this.hour==12 ? 12: this.hour%12),this.minute,this.second,((this.hour/12==0) ? "AM":"PM"));
    }

    public int getSecond(){ return second; }

    public int getMinute(){ return minute; }

    public int getHour(){ return hour; }
}
