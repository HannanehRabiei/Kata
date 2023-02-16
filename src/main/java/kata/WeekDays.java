package kata;

public class WeekDays {

    public void days(int number) {

         if (number==0)
           System.out.println("saturday");
       else if (number==1)
           System.out.println("sunday");
      else if (number==2)
           System.out.println("monday");
      else if (number==3)
           System.out.println("tuesday");
      else if (number==4)
           System.out.println("wednesday");
      else if (number==5)
           System.out.println("thursday");
      else if (number==6)
           System.out.println("friday");
      else {
             System.out.println("end");
         }
    }
}