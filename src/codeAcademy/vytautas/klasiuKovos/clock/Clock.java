package codeAcademy.vytautas.klasiuKovos.clock;

class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        setHours(12);
        setMinutes(0);
        setSeconds(0);
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int seconds) {
        setHours(seconds / 3600);
        setMinutes(seconds % 3600 / 60);
        setSeconds(seconds - getHours() * 3600 - getMinutes() * 60);
    }

    public void tick() {
        if (getSeconds() < 58) {
            setSeconds(getSeconds() + 1);
        } else if (getMinutes() < 58) {
            setMinutes(getMinutes() + 1);
            setSeconds(0);
        } else {
            setHours(getHours() + 1);
            setMinutes(0);
            setSeconds(0);
        }
    }

    public void addClock(Clock clock) {
        setHours(clock.getHours() + getHours());
        setMinutes(clock.getMinutes() + getMinutes());
        setSeconds(clock.getSeconds() + getSeconds());
    }

    public String toString() {
        return (getHours() + ":" + getMinutes() + ":" + getSeconds());
    }

    public void tickDown(){
        if(getSeconds()>0){
            setSeconds(getSeconds() - 1);
        } else if (getMinutes() > 0) {
            setMinutes(getMinutes() - 1);
            setSeconds(59);
        }else if (getHours() > 0){
            setHours(getHours() - 1);
            setMinutes(59);
            setSeconds(59);
        }else {
            System.out.println("U can't go back that much in time");
        }
    }

    public Clock subractClock(Clock clock){
        if(getHours() >= clock.hours && getMinutes() >= clock.getMinutes() && getSeconds() >= clock.getSeconds()){
            setHours(getHours() - clock.getHours());
            setMinutes(getMinutes() - clock.getMinutes());
            setSeconds(getSeconds() - clock.getSeconds());
        }else {
            System.out.println("U can't go back in time !!!!!!!!!!!!!");
        }

        return this;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
