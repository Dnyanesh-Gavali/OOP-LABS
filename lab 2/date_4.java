import java.util.Scanner;

class date {
    int year;
    int month;
    int day;

    date (int year, int month, int day) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (month % 2==0 && month!=8) {
            if (day>=1 && day<=30) {
                this.day = day;
            }
        }
        else {
            if (day>=1 && day<=31) {
                this.day = day;
            }
        }
    }

    public void setMonth(int month) {
        if (month >=1 && month<=12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year>=0) {
            this.year = year;
        }
    }

    void dateFormat(int day, int month, int year) {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class date_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a valid date(day): ");
        int day = sc.nextInt();

        System.out.println("Enter a valid month: ");
        int month = sc.nextInt();

        System.out.println("Enter a valid year(day): ");
        int year = sc.nextInt();

        date formatted_date = new date(year, month, day);
        
        formatted_date.dateFormat(day, month, year);

        sc.close();
    }
}