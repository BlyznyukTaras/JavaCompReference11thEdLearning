package src.ExamplePrograms.TaskClasses.HardClasses;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    public Clock() {
        hours = 14;
        minutes = 31;
        seconds = 58;
    }
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Clock(Clock obj) {
        hours = obj.hours;
        minutes = obj.minutes;
        seconds = obj.seconds;
    }
    public void show24Hours() {
        if (verifyTime()) System.out.printf("Current time: %d:%d:%d\n", hours, minutes, seconds);
        else System.out.println("Something is not right");
    }
    public void show12Hours() {
        if (verifyTime()) {
            if (hours == 0) System.out.printf("Current time (12h): 12:%d:%d PM\n", minutes, seconds);
            else if (hours <= 12) System.out.printf("Current time (12h): %d:%d:%d AM\n", hours, minutes, seconds );
            else System.out.printf("Current time (12h): %d:%d:%d PM\n", hours - 12, minutes, seconds);
        }
        else System.out.println("Something is not right");
    }
    public void changeTime(int newHours, int newMinutes, int newSeconds) {
        hours = newHours;
        minutes = newMinutes;
        seconds = newSeconds;
    }
    private boolean verifyTime() { return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59); }
}
