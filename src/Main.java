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

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


        System.out.println(txt.toLowerCase());   // Outputs "HELLO WORLD"

        txt = txt.toLowerCase();

        System.out.println(txt);
        System.out.println(txt.indexOf("b"));

        System.out.println(dirmanagername.concat(othermanagername));
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
        } else {
        System.out.println("Not old enough to vote.");
        }




        String ifString = (myAge > 30) ? "My age is over 30" : "My age is below 30";
        System.out.println(ifString);




        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }

        int a = 10;
        if (a<1){
            System.out.println(a);
        }else if(a>4){
            System.out.println(a+1000);
        }else{
            System.out.println(a+10);
        }

        System.out.println(a);

        int b = (a > 10)? 20 : 30+a;
        System.out.println(b);

        switch (b) {
            case 30:
                System.out.println("28332");
                break;
            case 20:
                System.out.println("2002020");
                break;
            default:
                break;
        }

        while (b<=100) {
            System.out.println(b);
            b++;
        }
        
        b = 1;
        do{
            System.out.println(b);
            b++;
        }
        while (b<=100);

        b = 1;
        a = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i=1;i<10;i++){
            System.out.println(i);
        }

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 

        String[] i = {"lyq","lzh","zzj","ljl","cyh","gyt","ljl"};
        for(String j: i){
            System.out.println(j);
        }

        System.out.println(i[0]);

        for(int j=0; j < i.length; j++){
            System.out.println(j);
        }

        for(String j : i){
            System.out.println(j);
        }
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for(int[] row : myNumbers){
            for(int j: row){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

    }
}
