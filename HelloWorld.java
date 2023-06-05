public class HelloWorld {
  public static void main(String[] args) {
      // System.out.println("Hello, World!");
      // int x = 0;
      // String testing = "hi";
      // double bigNum = 1000.00;
      // System.out.println(x);
      // System.out.println(testing);
      // System.out.println(bigNum);

      // Learn about object oriented programming (OOP)
      // codingBat is an object of the class HelloWorld
      // We can use the codingBat object to call the functions in the class
      HelloWorld codingBat = new HelloWorld();

      // System.out.println(
      // System.out.println(
      // System.out.println(

      String test = "hello_world";
      char test2 = 'a';

      for (int i = 0; i < test.length(); i++) {
        System.out.println("index: " + i);
        System.out.println("value at index: " + test.charAt(i));

        if (test.charAt(i) == 'l') {

          if (test.charAt(i + 1) == 'x') {

          }
          System.out.println("this is an l for loser");
        }

      }
      int [] a = new int[3];
      
      System.out.println("array length: " + a.length);

  }
} 