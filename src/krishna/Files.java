package krishna;

import java.io.File;
import java.io.FileWriter;

public class Files {
public static void main(String[] args) throws Exception {
FileWriter how = new FileWriter("D:/update.txt");
how.write("created a file");
how.flush();
how.close();


}	

}
