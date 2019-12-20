import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileWrite {

                public static void main(String[] args) {
                                try
                                {
                                                OutputStream os = new FileOutputStream("player.csv");
                                                String name;
                                                String teamName;
                                                int numberOfMatches;
                                                Scanner sc= new Scanner(System.in);
                                                System.out.println("Enter name");
                                                name = sc.nextLine();
                                                System.out.println("Enter team name");
                                                teamName = sc.nextLine();
                                                System.out.println("Enter number of matches");
                                                numberOfMatches = sc.nextInt();
                                                byte a[] = name.getBytes();
                                                byte b[] = teamName.getBytes();
                                                os.write(a);
                                                os.write(b);
                                                os.write(String.valueOf(numberOfMatches).getBytes());
                                                os.flush();
                                                os.close();
                                }
                                catch (IOException ex) {
                                                System.out.println(ex);
                                }

                }

}

