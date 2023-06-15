import java.util.logging.FileHandler;
import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.io.IOException;
import java.util.Scanner;

/**
 * taskHomeWork2
 */
public class task2HomeWork2 {

  public static void main(String[] args) throws SecurityException, IOException {

    Logger logger =  Logger.getLogger(task2HomeWork2.class.getName());
    FileHandler fh = new FileHandler("log.txt");
    logger.addHandler(fh);
    // SimpleFormatter sFormat = new SimpleFormatter();
    XMLFormatter sFormat = new XMLFormatter();
    fh.setFormatter(sFormat);

    Scanner iScanner = new Scanner(System.in);
    System.out.println("Enter size your array, please: ");    
    boolean flag = iScanner.hasNextInt();
    if (!flag) { 
      System.out.println("You entered an incorrect value");
    } else {
      int size = iScanner.nextInt(); 
      // Integer.parseInt(iScanner.nextLine().replaceAll(" ", ""));
      int [] useArray = new int[size];
      for (int index = 0; index < useArray.length; index++) {
        useArray[index] = (int)(Math.random()*100);
      }
      for (int index = 0; index < useArray.length; index++) {
        System.out.printf("%d ", useArray[index]);
      }
      int temp;
      int sizeArr = useArray.length;
      for (int i = 0; i < sizeArr - 1; i++) {
        for (int y = i + 1; y < sizeArr; y++) {
          if (useArray[i] > useArray[y]) {
            temp = useArray[y];
            useArray[y] = useArray[i];
            useArray[i] = temp;
          }
          logger.info(String.valueOf(useArray[i]));
        }
      }
      System.out.println();
      for (int index = 0; index < useArray.length; index++) {
        System.out.printf("%d ", useArray[index]);
      }
    }    
    iScanner.close();

  }
  public static Object getClass (Object object) {
    return object.getClass().getName();
  }
}