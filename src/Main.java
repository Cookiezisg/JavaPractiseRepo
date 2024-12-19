public class Main {
  int x;
  int y;
  public Main(int x1, int y1){
    x = x1;
    y = y1;
  }

  public static void main(String[] args){
    Main classobj = new Main(12, 20);
    System.out.println(classobj.x);
    System.out.println(classobj.y);
  }
}