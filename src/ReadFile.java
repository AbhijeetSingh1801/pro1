import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public void start(){
    try{
      File myObj = new File("file.txt");
      Scanner myReader = new Scanner(myObj);

      while(myReader.hasNextLine()){
        String data = myReader.nextLine();
        System.out.println(data);
      }
      System.out.println("------- THE END -------");
      myReader.close();
    }catch (FileNotFoundException e) {
      System.out.println("An Error Occurred !!!");
      e.printStackTrace();
    }
  }
}
