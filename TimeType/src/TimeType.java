public class TimeType {
        private int hour,minute,second;

    public TimeType(){
        }

    public TimeType(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeType(String something) {
    }

    public boolean Set(int h, int m, int s){
        if(0<=h & h<=23 & 0<=m & m<=59 & 0<=s & s<=59){
            hour = h;
            minute = m;
            second = s;
            return true;
        }
        else return false;
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
        String string;
        if(hour<10){
            string = "0"+hour+":";
        }
        else string = hour+":";
        if(minute<10){
            string = string+"0"+minute+":";
        }
        else string = string +minute+":";
        if(second<10){
            string = string+"0"+second;
        }
        else string = string+second;
        return string;
    }
}
