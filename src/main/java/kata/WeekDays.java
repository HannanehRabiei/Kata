package kata;

public class WeekDays {

    public int days(int zero , int one, int two, int three, int four, int five, int six) {

        int day=4;

         if (day==zero)
           System.out.println("saturday");
       else if (day==one)
           System.out.println("sunday");
      else if (day==two)
           System.out.println("monday");
      else if (day==three)
           System.out.println("tuesday");
      else if (day==four)
           System.out.println("wednesday");
      else if (day==five)
           System.out.println("thursday");
      else if (day==six)
           System.out.println("friday");
      else {
             System.out.println("end");
         }

       return day;
    }
}