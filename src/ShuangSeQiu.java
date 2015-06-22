import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class ShuangSeQiu {
  private List<Integer> red = new LinkedList<Integer>();
  private List<Integer> blue = new LinkedList<Integer>();
  private Random ran = new Random(new Date().getTime());
  
  
  public ShuangSeQiu() {
    super();
    for(int i = 1; i <=33; i ++){
      red.add(i);
    }
    for(int i = 1; i <=16; i ++){
      blue.add(i);
    }
  }




  public static void main(String[] args) {
    ShuangSeQiu o = new ShuangSeQiu();
    o.outputRed();
    System.out.println();
    o.outputBlue();
  }




  private void outputBlue() {
    int curSize = blue.size();
    while(curSize != 0){
      int index = ran.nextInt(curSize);
      Integer redNum = blue.get(index);
      String outputSegment = redNum + " ";
      System.out.print(outputSegment);
      blue.remove(index);
      curSize = blue.size();
    }
    System.out.println();    
  }




  private void outputRed() {
    int curSize = red.size();
    while(curSize != 0){
      int index = ran.nextInt(curSize);
      Integer redNum = red.get(index);
      String outputSegment = redNum + " ";
      System.out.print(outputSegment);
      red.remove(index);
      curSize = red.size();
    }
    System.out.println();
  }
}
