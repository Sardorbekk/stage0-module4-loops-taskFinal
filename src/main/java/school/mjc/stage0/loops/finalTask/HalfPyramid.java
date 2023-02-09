package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
      for (int column=0;column<cathetusLength;column++){
          for (int row=column;row<cathetusLength-1;row++){
              System.out.print(" ");
          }
          for (int row=0;row<=column;row++){
              System.out.print("*");
          }
          System.out.println();

      }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
