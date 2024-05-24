package Day12_OOP4;

/**
 * Blueprint of a class
 * plan of the class
 */
interface Date{
    void setDate(int day, int month, int year);
    void setYear(int year);
    void setMonth(int month);
    void setDay(int day);
    int getYear();
    int getMonth();
    int getDay();
    void printDate();
}

class DateImpl implements Date{
    private int year;
    private int month;
    private int day;

    DateImpl(){}

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void printDate(){
        System.out.println(this.year + "-" + this.month + "-" + this.day);
    }
}

class Q54 {
    public static void main(String[] args) {
        Date d1 = new DateImpl();
        d1.setDate(25, 11, 1997);
        d1.printDate();
    }
}

