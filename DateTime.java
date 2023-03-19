import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTime
{
 public static void main(String[] args)
 {
  LocalDate currdate=LocalDate.now();
  System.out.println("The Date is  "+currdate);
  LocalTime currtime=LocalTime.now();
  System.out.println("The Time is  "+currtime);
  LocalDateTime currDateTime = LocalDateTime.now();
  System.out.println("Current Date and Time  " + currDateTime);
  DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  String formattedDate = currDateTime.format(formatDateTime);
  System.out.println("After formatting: " + formattedDate);
 }
}