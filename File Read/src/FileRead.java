import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

                public static void main(String[] args) {
                                Scanner s = new Scanner(System.in);
                        System.out.println("Enter the file name");
                        String gen;
                        gen= s.nextLine();
                        String ln=null;
                        try
                      {
                           
                            FileReader fl = new FileReader(gen);
                            
                           
                            BufferedReader bd = new BufferedReader(fl);
                            
                            ln = bd.readLine();
                          {
                                System.out.println(ln);
                            }
                            
                          
                            bd.close();
                       }
                       catch(IOException ex)
                       {
                           System.out.println(ex);
                       }
                }
}
