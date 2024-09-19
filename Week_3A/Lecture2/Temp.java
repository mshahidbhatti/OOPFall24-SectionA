public class Time {
    private int minutes;
    private int seconds;
    private int hours;

    Time(Time time) {
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
        this.hours = time.getHours();

    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Time(int minutes, int seconds, int hours) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = hours;
    }
}



public class Date {
    private int day;
    private int month;
    private int year;

    private Time time;

    public Date(int day, int month, int year, Time time) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
    }
    Date(Date date){
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
     //   this.time = date.getTime();
        this.time = new Time(date.getTime());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void display(){
        System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, day, time.getHours(), time.getMinutes(), time.getSeconds());
    }
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Date d1=new Date(1,1,1,new Time(1,1,1));
        d1.display();

        d1.display();
        Date temp=new Date(d1);
        temp.display();
        d1.getTime().setHours(12);
        d1.display();




    }
}