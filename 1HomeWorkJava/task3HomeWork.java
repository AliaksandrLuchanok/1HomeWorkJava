import java.util.ArrayList;
import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.Iterator;


/**
 * HomeWork3
 */
public class task3HomeWork {
  public static void main(String[] args) {
    int temp;
    int setSize = 25;
    List<Integer> useList = new ArrayList<>(setSize);
    int count = 0;
    while (count < setSize) {
      temp = (int) (Math.random()*100);
      useList.add(temp);
      count++;
    }
    System.out.println(useList);
    count = 0;
    while (count < setSize) {
      if (useList.get(count)%2 == 0) {
        useList.remove(count);
        setSize--;
      } else {
        count++;
      }      
    }
    count = 1;
    int max = useList.get(0);
    int min = max;
    int sum = min;
    double average;
    // Iterator <Integer> iterator = useList.iterator();
    while (count < setSize) {
      sum += useList.get(count);
      if (max > useList.get(count)) {
        max = useList.get(count);
      } else  if (min < useList.get(count)) {
        min = useList.get(count);
      }
      count++;
    }
    System.out.println(useList);
    average = sum/setSize;
    System.out.printf("Maximum value is %d \nMinimum value is %d \nAverage value is %d", max, min, Math.round(average));


  }
}