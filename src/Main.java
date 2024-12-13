// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("I'm learning JAVA");
        

        System.out.print("Test this function");
        System.out.print("there should be no new line");
        System.out.println("");
        System.out.println("**********************");

        System.out.println(3+3);

        String dirmanagername = "Lee Jia Hui";
        System.out.println(dirmanagername);

        String othermanagername = "Carlos Xu Han";
        System.out.println(othermanagername);

        System.out.println(dirmanagername + " " + othermanagername);

        int x,y,z;
        x=y=z=1;
        System.out.println(x+y+z);

        float myFloatNum = 5.99f; 
        System.out.println(myFloatNum);

        double myDoubleNum = 2.5;
        System.out.println(myDoubleNum);

        byte myByte = 22;
        System.out.println(myByte);

        float f1 = 35E4f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items + costPerItem;
        totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        System.out.println(items);
        double double_items = items;
        System.out.println(double_items);

        int backToInt = (int) double_items;
        System.out.println(backToInt);

        int maxScore = 500;
        int userScore = 432;
        //float percentage = userScore / maxScore * 100;
         float percentage = (float) userScore / maxScore * 100f;

        System.out.println(percentage);

        userScore += 5;
        System.out.println(userScore);

        System.out.println(userScore > maxScore);
        System.out.println(x < 5 &&  x < 10);
        System.out.println(true || true);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


        System.out.println(txt.toLowerCase());   // Outputs "HELLO WORLD"

        txt = txt.toLowerCase();

        System.out.println(txt);
        System.out.println(txt.indexOf("b"));

        System.out.println(dirmanagername.concat(othermanagername));
    }


}
