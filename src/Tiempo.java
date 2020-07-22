public class Tiempo {
    private int hour;
    private int minute;
    private int second;

    public Tiempo() {
    }

    public Tiempo(int hour, int minute, int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%02d" , hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }

    public void nextSecond(){
        if(second==59){
            minute++;
            if(minute>59){
                hour++;
                if(hour>23){
                    hour = 00;
                }
                minute=00;
            }
            second=00;
        }else{
            second++;
        }
    }

    public void prevSecond(){
        if(getSecond()==0){
            setMinute(getMinute()-1);
            if(getMinute()<0){
                setMinute(59);
                setHour(getHour()-1);
                if(getHour()<0){
                    setHour(23);
                }
            }
            setSecond(59);
        }else{
            setSecond(getSecond()-1);
        }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
