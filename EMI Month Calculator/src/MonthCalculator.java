import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MonthCalculator {

                public static void main(String[] args) {
                                Scanner  sc = new Scanner(System.in);
                                String dt;
                                dt = sc.nextLine();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
                    LocalDate date = LocalDate.parse(dt, formatter);
                    LocalDate date2 = date.minusMonths(20);
                                System.out.println("20 months before"+date+"will be"+date2);
                }

}
