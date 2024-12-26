import mypack.MyPackage;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;


abstract class Animal{
  public abstract void animalSound();
  public static void animalSleep(){
    System.out.println("zzz");
  }
}

class Pig extends Animal{
  public void animalSound(){
    System.out.println("heng heng");
  }
}

interface DaCanCode {
  public void daCode();
}

interface DaCanAnalysis {
  public void daAnalysis();
  
}

class DaSWL implements DaCanAnalysis, DaCanCode{
  public void daCode(){
    System.out.println("I can write sql");
  }
  public void daAnalysis(){
    System.out.println("I can write reports");
  }
}

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

    classobj.x = 10000;
    System.out.println(classobj.x);

    Pig pigObj = new Pig();
    pigObj.animalSleep();
    pigObj.animalSound();


    DaSWL swlIsHere = new DaSWL();
    swlIsHere.daAnalysis();
    swlIsHere.daCode();


    enum level {
      LOW,
      MEDIUM,
      HIGH
    }

    level myLevel = level.LOW;

    switch (myLevel) {
      case LOW:
        System.out.println("Low Level");
        break;
      case MEDIUM:
        System.out.println("Medium Level");
      case HIGH:
        System.out.println("High Level");
      default:
        break;
    } 

    System.out.println(level.values());;
    level[] level_list = level.values();
    System.out.println(level_list);

    for (level myEachLevel : level.values()) {
      System.out.println(myEachLevel);
    }

    Scanner myScanner = new Scanner(System.in);
    //tring myName = myScanner.nextLine();
    //System.out.println("Your name is: " + myName);

    LocalDate myLocalDate = LocalDate.now();
    System.out.println(myLocalDate);

    System.out.println(myLevel);

    System.out.println(myScanner);

    LocalDateTime myLocalDateTime = LocalDateTime.now();
    System.out.println(myLocalDateTime);

    DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss");
    System.out.println(myLocalDateTime);
    String formattedDateTime = myLocalDateTime.format(myDateTimeFormatter);
    System.out.println(formattedDateTime);

    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(numbers);

    for(int i : numbers){
      System.out.println(i);
    }


    ArrayList<String> myList = new ArrayList<String>();
    myList.add("whta");
    myList.add("shabi");
    myList.add(0,"shabishabi");
    for(String i: myList){
      System.out.println(i);
    }

    System.out.println(myList.get(0));
    myList.get(0);

    HashMap<String,String> myHashMap = new HashMap<String,String>();
    myHashMap.put("swl", "lyq");
    myHashMap.put("lzh", "ppu");
    System.out.println(myHashMap);

    System.out.println(' ');
    System.out.println(' ');

    System.out.println(myHashMap.get("lzh"));
    System.out.println(myHashMap.size());
  }
}